# 인텔리제이 설정
shift 두번 연타 후 plugin 검색 -> plugins -> marketplace 
1. 한글 패치 : 한글 패치 다운
2. 테마 설치 : material 검색후 atom material 과 material theme 설치
   * 테마 적용 : 설정 -> 모양 -> 테마 설정
3. 기본 폰트사이즈, 폰트사이즈 조절 설정
   - 파일 -> 설정 -> 글꼴 검색 후 사이즈 조절 설정
   - 파일 -> 설정 -> 폰트 검색후 폰트 설정
4. 키 프로모터 설치, 번역기 설치
5. 깃허브 연동
   - 파일 -> 설정 -> 버전관리 -> 깃허브 계정 추가
   - 하단부 터미널 열고 $ git rm -r --cached 입력

## 자바 8 람다 문법
- 여러가지 람다 표현식
   1. `(String s) -> s.length()` : String형식의 파라미터 하나를 가지며 int를 반환한다. 람다표현식에는 return이 함축되어 있다.
   2. `(Apple a) -> a.getWeight() > 150` : Apple형식의 파라미터 하나를 가지며 boolean을 반환한다.
   3. int형식의 2개의 파라미터를 가지며 리턴값이 없다.
       ```
            (int x, int y) -> {
                System.out.println("Result:");
                System.out.println(x + y);
            }
       ```
   4. `() -> 42` : 파라미터가 없으며 42를 반환한다.

- 제공되는 함수형 인터페이스

| 함수형 인터페이스           | 함수 디스크립터          |
|---------------------|-------------------|
| Predicate<T>        | T -> boolean      |
 | Consumer<T>         | T -> void         |
| Function<T, R>      | T -> R            |
| Supplier<T>         | () -> T           |
| UnaryOperator<T>    | T -> T            |
| BinaryOperator<T>   | (T, T) -> T       |
| BiPredicate<L, R>   | (T, U) -> boolean |
| BiConsumer<T, U>    | (T, U) -> void    |
| BiFunction<T, U, R> | (T, U) -> R       |

- 메서드 참조
   - `(args) -> ClassName.staticMethod(args)` => `ClassName::staticMethod`
      - `() -> Math.random()` => `Math::random`
      - `message -> System.out.println(message)` => `System.out::println`

   - `(args0, rest) -> args0.instanceMethod(rest)` => `ClassName::instanceMethod`
      - `(str, i) -> str.substring(i)` => `String::substring`
      - `(apple) -> apple.getWeight()` => `Apple::getWeight`
   - `(args) -> expr.instanceMethod(args)` => `expr::instanceMethod`
      - `(s) -> this.isValidName(s)` => `this::isValidName`

- 생성자 참조
   - `() -> new Constructor()` => `ClassName::new`
      - `() -> new Apple()`  => `Apple::new`
   - `(args) -> new Constructor(args)` => `ClassName::new`
      - `(weight) -> new Apple(weight)` => `Apple::new`