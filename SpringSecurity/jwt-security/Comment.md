# Package

## auth, common, user

### auth - config, filter, handler, interceptor, model

|     1      |         2          |                 3                 |         4          |
|:----------:|:------------------:|:---------------------------------:|:------------------:|
|  **auth**  |      `config`      |        MyBatisConfig.java         |                    |
|            |                    |          WebConfig.java           |                    |
|            |                    |      WebSecurityConfig.java       |                    |
|            |      `filter`      |  CustomAuthenticationFilter.java  |                    |
|            |                    |         HeaderFilter.java         |                    |
|            |                    |    JwtAuthorizationFilter.java    |                    |
|            |     `handler`      |   CustomAuthFailureHandler.java   |                    |
|            |                    |   CusTomAuthSuccessHandler.java   |                    |
|            |                    | CustomAuthenticationProvider.java |                    |
|            |   `interceptor`    |     JwtTokenInterceptor.java      |                    |
|            |      `model`       |             `service`             | detailService.java |
| **common** | AuthConstants.java |                                   |                    |
|            |   UserRole.java    |                                   |                    |
|            |      `utils`       |         ConvertUtil.java          |                    |
|            |                    |          TokenUtils.java          |                    |
|  **user**  |    `controller`    |        TestController.java        |                    |
|            |                    |        UserController.java        |                    |
|            |       `dto`        |           LoginUserDTO            |                    |
|            |      `mapper`      |          UserMapper.java          |                    |
|            |     `service`      |         UserService.java          |                    |



