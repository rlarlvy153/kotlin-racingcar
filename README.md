# kotlin-racingcar

#기능 요구 사항

사용자가 입력한 문자열 값에 따라 사칙 연산을 수행할 수 있는 계산기를 구현해야 한다.
문자열 계산기는 사칙 연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

#step 2
~~덧셈~~  
~~뺄셈~~  
~~곱셈~~  
~~나눗셈~~  
~~입력값이 null이거나 빈 공백 문자일 경우 IllegalArgumentException throw~~  
~~사칙연산 기호가 아닌 경우 IllegalArgumentException throw~~  
~~사칙 연산을 모두 포함하는 기능 구현~~  
~~CsvSource 사용하기~~  
~~테스트 이름 상세하게 표현하기~~  
~~assertThrows / assertThatExceptionOfType 차이알아보고 수정하기~~   
~~validOperator 함수분리~~
~~StringCalculator input하나로 받기~~    
~~StringCalculator 재사용하게 변경~~  
~~StringCalculator를 사용한 콘솔프로그램 만들기~~  
~~Operation 계산로직 Operator가 담당하게 변경~~  
~~린트 체크~~  

~~메인으로 파일들 이동~~  
~~readLine, readln 차이 알아보고 필요하면 적용~~  
~~IllegalArgumentException kotlin에 선언된걸로 사용~~  
~~계산로직 operator에서 분리하기~~  
~~에러상수 접근한정자제한 및 위치수정~~  
~~오퍼레이터 테스트코드 작성~~  
~~companion object 컨벤션 참고 및 수정~~  

#step3 자동차 경주 (src/main/kotlin/racingcar)
#기능 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.  
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.  
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.  
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
#프로그래밍 요구사항
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
- UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.

## TODO LIST
### 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- [x] 특정 값 이상 전진, 미만 유지 하는 로직구현

###  사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- [x] 몇대의 자동차로 게임 진행할지 사용자의 입력을 받아 차량대수 만들기
- [x] 몇회의 시도로 게임을 할지 사용자의 입력을 받아 진행
- [x] 자연수를 판단하는 로직
- [x] 자연수를 입력받는 ui 구현

### 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- [x] 특정 값 이상 전진, 미만 유지 하는 로직구현에서 4이상일 경우로 만들기

### 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
- [x] 게임결과를 사용자에게 출력하는 기능
- [x] 게임 결과를 출력하는 ui 구현
- [x] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.  
- [x] UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.

### 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- [x] 사용자 입력이 자연수인지 테스트하는 로직 테스트
- [x] 차량 대수만큼 차를 생성하는지 테스트
- [x] 시도 회수만큼 게임을 진행하는지 테스트
- [x] 레이싱 카 테스트에서 각 부분별 테스트 분리

### 리뷰사항
- [x] 리드미 업데이트 해보기
- [x] Car 클래스의 position 외부 수정 제한
- [x] 매직넘버 상수화
- [x] 랜덤값이 로직에 있어서 테스트가 힘들다.. 어떻게 할 수 있을까?
- [x] 비교에 대한 부분 그룹지어주기
- [x] RacingCarGame클래스의 gameResult 외부 수정 제한
- [x] RacingCarGame 생성할 때 Car 리스트 셋업
- [x] proceed 함수 간결하게 표현식 형태 함수로 변경
