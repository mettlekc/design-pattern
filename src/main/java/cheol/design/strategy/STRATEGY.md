## Enum 접근의 문제
* 클래식 구현은 전략 구현이 별도의 클래스에 있기 때문에 새 전략을 구현이 쉽다.
* Enum 전략은 컴파일 타임에 모든 전략을 알아야 하며 런타임에 새로운 전략 추가를 할 수 없다.
* OCP 규칙을 위반한다
* 추가 할 전략이 많지 않을 경우 권장하지만 그렇지 않을 경우 클래스로 구현하자.

## Ref.
[An Enum implementation of the Strategy pattern](https://readlearncode.com/design-patterns/an-enum-implementation-of-the-strategy-pattern/)