MVC (모델-뷰-컨트롤러) 는 사용자 인터페이스, 데이터 및 논리 제어를 구현하는데 널리 사용되는 소프트웨어 디자인 패턴입니다. 
소프트웨어의 비즈니스 로직과 화면을 구분하는데 중점을 두고 있습니다. 이러한 "관심사 분리" 는 더나은 업무의 분리와 향상된 관리를 제공합니다. 
MVC 에 기반을 둔 몇 가지 다른 디자인 패턴으로 MVVM (모델-뷰-뷰모델), MVP (모델-뷰-프리젠터), MVW (모델-뷰-왓에버)가 있습니다.

MVC 소프트웨어 디자인 패턴의 세 가지 부분은 다음과 같이 설명할 수 있습니다.

모델: 데이터와 비즈니스 로직을 관리합니다.
뷰: 레이아웃과 화면을 처리합니다.
컨트롤러: 모델과 뷰로 명령을 전달합니다.

모델 뷰 컨트롤러 예시
간단한 쇼핑 리스트 앱이 있다고 상상해봅시다. 우리가 원하는 것은 이번 주에 사야할 각 항목의 이름, 개수, 가격의 목록입니다. MVC 를 사용해 이 기능의 일부를 구현하는 방법을 아래에서 설명할 것입니다.

***

#모델

모델은 앱이 포함해야할 데이터가 무엇인지를 정의합니다. 데이터의 상태가 변경되면, 모델을 일반적으로 뷰에게 알리며(따라서 필요한 대로 화면을 변경할 수 있습니다) 가끔 컨트롤러에게 알리기도 합니다(업데이트 된 뷰를 조절하기 위해 다른 로직이 필요한 경우).

다시 쇼핑 리스트 앱으로 돌아가서, 모델은 리스트 항목이 포함해야 하는 데이터 — 품목, 가격, 등. — 와 이미 존재하는 리스트 항목이 무엇인지를 지정합니다.

#뷰
뷰는 앱의 데이터를 보여주는 방식을 정의합니다.

쇼핑 리스트 앱에서, 뷰는 항목이 사용자에게 보여지는 방식을 정의하며, 표시할 데이터를 모델로부터 받습니다.

#컨트롤러
컨트롤러는 앱의 사용자로부터의 입력에 대한 응답으로 모델 및/또는 뷰를 업데이트하는 로직을 포함합니다.

예를 들어보면, 쇼핑 리스트는 항목을 추가하거나 제거할 수 있게 해주는 입력 폼과 버튼을 갖습니다. 이러한 액션들은 모델이 업데이트되는 것이므로, 입력이 컨트롤러에게 전송되고, 모델을 적당하게 처리한 다음, 업데이트된 데이터를 뷰로 전송합니다.

단순히 데이터를 다른 형태로 나타내기 위해 뷰를 업데이트하고 싶을 수도 있습니다(예를 들면, 항목을 알파벳순서로 정렬한다거나, 가격이 낮은 순서 또는 높은 순서로 정렬). 이런 경우에 컨트롤러는 모델을 업데이트할 필요 없이 바로 처리할 수 있습니다.

