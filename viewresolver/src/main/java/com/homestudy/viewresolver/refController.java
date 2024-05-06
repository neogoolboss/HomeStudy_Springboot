package com.homestudy.viewresolver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class refController {

    @RestController
    @RequestMapping("/diary")
    @RequiredArgsConstructor
    public class DiaryController {
        private final DiaryService diaryService;
        //일기 작성
        @PostMapping("/new")
        public ResponseEntity<Boolean> diaryReg(@RequestBody DiaryDto diaryDto) {
            boolean isTrue = diaryService.saveDiary(diaryDto);
            return ResponseEntity.ok(isTrue);
        }
        //일기 삭제
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Boolean> diaryDelete(@PathVariable Long id) {
            boolean isTrue = diaryService.deleteDiary(id);
            return ResponseEntity.ok(isTrue);
        }
        //일기 수정
        @PutMapping("/modify/{id}")
        public ResponseEntity<Boolean> diaryModify(@PathVariable Long id, @RequestBody DiaryDto diaryDto) {
            boolean isTrue = diaryService.modifyDiary(id, diaryDto);
            return ResponseEntity.ok(isTrue);
        }
        //일기 출력
        @GetMapping("/detail/{email}/{date}")
        public ResponseEntity<DiaryDto> boardDetail(@PathVariable String email, String date) {
            DiaryDto diaryDto = diaryService.diaryDetail(email,LocalDate.parse(date));
            return ResponseEntity.ok(diaryDto);
        }

        //캘린더 내용 출력
        @GetMapping("/Calender/{email}")
        public ResponseEntity<Map<LocalDate,String>> boardDetail(@PathVariable String email) {
            Map<LocalDate,String> CalenderList = diaryService.CalenderMap(email);
            return ResponseEntity.ok(CalenderList);
        }


}
