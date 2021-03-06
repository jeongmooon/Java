# 컴퓨터언어
## HLL(High-level language)
- 사람이 이해하기 쉽게 작성된 프로그래밍언어
- 사람이 이해하기가 쉽기 때문에, LLL보다 가독성이 높고 다루기가 간단하다는 장점
- 컴파일러나 인터프리터로 LLL로 번역되어 실행됨
- 해석(인터프리트)
	- 이것으로 작성된 코드는 컴파일 과정 없이 문법으로 읽고 실행
	- 다른 두개의 종류에 비해 인터프리터는 가장 단순한 언어의 동작 구현체
- 컴파일
	- 기계어 생성 : 기계어로 직접 컴파일함, 제일 원초적인 방식으로, 기계어로 직접적으로 완전하게 변환된 언어들은 truly compiled laguage라 부름
	- 중간 표현 : 특정언어로 작성된 코드가 중간 표현으로 컴파일되면, 이 표현은 소스코드를 다시 읽어들이지 않고도 나중에 실행될것을 염두해 최적화 하거나 저장해 둘수있다.
- 소스 대 소드 번역(다른 프로그래밍 언어로의 번역)
	- 자바스크립트나 C프로그래밍언어는 이런 것들의 대상

## LLL(Low-level language)
- 컴퓨터가 이해하기 쉽게 작성된 프로그래밍 언어
- 기계어와 어셈블리어를 일반적으로 말함
- 실행속도가 매우빠르지만, 유지보수가 힘든것이 단점
- 기계어
	- 특별한 변환과정없이 컴퓨터가 직접처리할 수 있는 언어
	- 명령어마다 수많은 코드를 기억하고 찾아야 하고 수정하기도 어려움
- 어셈블리어
	- 2세대 언어로 기계어 최상단에 위치한언어로 추상적인 수준을 제공함
	- TX-0, PDP-1과 같은 컴퓨터들을 이용하여 코딩하던 과거에 쓰던언어
	- 대부분의 어셈블러는 매크로를 제공하므로 공통이되는 일련의 명령들을 만들 수 있음


<hr />


# Java 특징

## 호환성이 높은 언어
- 자바(Java)는 JVM(Java Virtual Machine) 위에서 돌아가기 때문에 운영체제(OS)의 종류에 상관없이 실행되게 됩니다. 

- C언어의 경우에는 운영체제의 종류에 따라서 int형의 크기가 달라지기도 하지만 Java의 경우에는 모두 동일한 JVM환경에서 실행이 되어서 그렇습니다.

## [객체지향 프로그래밍(OOP)](#OOP)
- 객체지향(Object Oriented Programing)이다.
- 현실 세계에 인지 할 수 있는 모든것을 개채로 만들어 표현한 방법론
- 간단하게 말해 객체지향 프로그래밍 언어는 하나의 기능을 객체로 만들고, 이러한 **객체**들을 결합해서 **하나의 프로그램**을 만드는 것이다.

ex)
```
노트북을 예로들면

노트북 = 완성된 프로그램

CPU, 그래픽카드, 등등 =객체
```

## 함수적 스타일링 코딩을 지원
- 자바는 함수 프로그래밍을 위해 람다식을 자바 8부터 지원하고 있습니다.

- 람다식을 사용하면 컬렉션의 요소를 필터링, 매핑, 집계 처리하는데 쉬워지고, 코드가 간결해집니다.

## [메모리를 자동으로 관리](#메모리)
- C언어는 메모리에 생성된 객체를 제거하기 위해 개발자가 직접 코드를 작성해야 합니다.

- 자바는 개발자가 직접 메모리에 접근할 수 없도록 설계가 되어 있지만, 메모리는 자바가 직접 관리하게 됩니다.

- 객체 생성 시 자동적으로 메모리 영역을 찾아가서 할당하고, 사용이 완료되면 쓰레기수집기(Garbage Collector)를 샐행 시켜 자동적으로 사용하지 않는 객체를 제거합니다.

## 다양한 에플리케이션 개발
- 자바는 JVM을 사용함으로써 윈도우, 리눅스, 유닉스등 다양한 OS체제에서 실행되는 프로그램을 개발이 가능합니다.

- 단순한 콘솔 프로그램부터 클라이언트용 윈도우 애플리케이션, 서버용 웹 애플리케이션 모바일까지 모두 가능합니다.

## 멀티스레드 구현
- 하나의 프로그램이 동시에 여러 작업을 처리해야하는 경우, 그리고 대용량 작업을 빨리 처리하기 위해 서브 작업으로 분리해서 병렬 처리하려면 멀티스레드 프로그래밍이 필요합니다.

- 자바는 쓰레드 생성 및 제어와 관련된 라이브러리 API를 제공하고 있기 때문에 실행되는 운영체제에 관계없이 멀티 스레드를 쉽게 구현이 가능합니다.

## 동적 로딩(Dynamic Loading)지원
- 자바 애플리케이션은 여러개의 객체가 서로 연결되어 실행되는데, 이객체들은 클래스로부터 실행이됩니다.

- 애플리케이션이 실행될 때 모든 객체가 실행되지 않고, 객체가 필요한 시점에 클래스를 동적 로딩해서 객체를 생성합니다.

- 개발 후 유지보수가 발생하더라도 해당 클래스만 수정하면되고 전체적으로 다시 컴파일링을 할 필요가 없습니다.

## 오픈소스 라이브러리가 많다
- 유료화가 일부 진행되었지만, 자바는 오픈소스 언어이고 자바를 이용해서 전 세계에서 만들어진 라이브러리들이 굉장히 많습니다.

- 때문에 애플리케이션을 만들 때 오픈소스를 참고한다면 시간비용 절약이 가능합니다.

## 함수적 스타일링

### 람다식이란?
- 자바에서 함수형을 프로그래밍 하기 위해 자바8부터 지원된 개념

- 람다식은 **익명함수**를 생성하기 위한 식으로 코드가 간결, 병렬처리 가능, 컬렉션 요소를 필터링하거나 매핑가능해 결과를 쉽게 집계 가능
    - **익명함수**란 함수의 이름이 없는 함수로, 익명함수들은 모두 **1급 객체**다.
    - **1급 객체**인 함수는 변수처럼 사용이 가능하고 매게 변수로 전달이 가능한 특징이 있다.
        - **1급 객체**란?
            - 변수나 데이터 구조안에 담을 수 있다.
            - 파라미터로 전달 할 수 있다.
            - 반환값으로 사용할 수 있다.
            - 할당에 사용된 이름과 무관하게 고유한 구별이 가능하다.

#### 특징
- 람다식 내에서 사용되는 지역변수는 final이 붙지 않아도 상수로 간주된다.
- 람다식으로 선언된 변수명은 다른 변수명과 중복될 수 없다.

#### 장점
1. 코드를 간결하게 만들 수 있다.
2. 식에 개발자의 의도가 명확하게 드러나 가독성이 높아진다.
3. 함수를 만드는 과정없이 한번에 처리할 수있어 생산성이 높아진다.
4. 병렬프로그래밍이 용이하다.

#### 단점
1. 람다를사용하면서 무명함수는 재사용이 불가능하다.
2. 디버깅이 어렵다.
3. 람다를 남발하면 비슷한 함수가 중복 생성되어 코드가 지저분해질 수 있다.
4. 재귀로 만들경우 부적합하다.

## 메모리

### Stack
- Stack은 Heap 객체의 참조 실제 값 자체를 갖는 데이터(Java 기본형)를 저장한다.
- 해당 객체는 scope 범위에서만 사용된다.
- 전역 변수가 아닌 지역 변수가 어떤 함수 내에서 stack에 할당되면 다른 함수에서는 접근할 수 없다.
- 자바의 Stack 메모리는 스레드당 할당된다. **스레드**가 생성되고 시작될 때 스레드는 자신의 Stack 메모리를 갖고, 다른 스레드 Stack 메모리에 접근할 수 없다. 
    - **스레드**란?
        - 메모리를 할당받아 실행 중인 프로그램을 프로세스라고 한다.
        - 프로세스 내의 명령어 블록으로 시작점과 종료점을 가진다.
        - 실행중에 멈출 수 있고, 동시에 수행이 가능하다.
        - 어떠한 프로그램내에서 특히 프로세스 내에서 실행되는 흐름의 단위

### Heap
- Heap 영역은 메모리에 실제 객체를 저장
- Heap 영역은 주로 긴 생명주기를 가지는 데이터들이 저장
- 모든 Object타입(Integer, String, ArrayList, HashMap등)은 Heap영역에 생성
- Heap 영역에 있는 Object들을 가리키는 레퍼런스 변수가 Stack에 저장

- String은 내부적으로 new 생성자를 통해 메모리 할당, 때문에 Heap에 충분한 여유공간이 있는지 확인하고, 메모리에 String타입 객체를 만들고 **참조 변수(주소)**를 통해 해당객체로 접근

### Garbage Collection
- Garbage Collection은 Garbage Collector가 Garbage를 Garbage Collecting하는 과정
- 불필요한 메모리를 삭제해주는 것
- System.gc()를 통해 호출은 되지만, 해당 메소드를 호출하는 것은 시스템 성능에 큰 영향을 주어서 절대 호출해서는 안됨

#### 활용 예시
```
A a = new A();
a.a();
a = null;
// 사용을 하고나서 null을 주어서 식별성을 끊어서 GC에게 없어지도록 초기화

new A.a();
// 바로 호출해서 사용하고 식별성은 주지않아서 다른작업 없이 GC에게 초기화
```
- null : 식별성을 초기화하는 것?
- 사용 방식차이
	- a변수에 식별성을 담는 이유는 만든 인스턴스를 재활용 할 때 사용함
	- 바로 만들어서 호출 하는 이유는 재활용 하지 않고 바로 사용하고 버릴 경우

#### 동작 방식
1. Stop The World
    - JVM이 애플리케이션을 실행을 멈추는 작업
    - GC를 실행하는 쓰레드를 제외하고 모든 쓰레드들의 작업이 중단되고, GC완료후 재게
    - JVM에서도 이런 문제를 해결하기위해 다양한 실행 옵션을 제공 중

2. Mark and Sweep
    - Mark : 사용되는 메모리와 사용하지 않는 메모리 식별하는 작업
    - Sweep : Mark 단계에서 사용되지 않음으로 식별된 메모리를 해제하는 작업

    - 1번을 통해 모든 작업을 중단시키면, GC는 변수, 객체를 스캔하면서 각각이 어떤 객체를 참고하는지 탐색한다. 그리고 **사용되고 있는 메모리**를 식별, 이과정을 **Mark**라고 한다.

    - 이후 **Mark되지 않은 객체들을 메모리에서 제거** 이것이 **Sweep**이다.

<hr />

# OOP

## OOP(Object Oriented Programming)
 - 객체를 기준으로 나누어 구현(Java는 부분 단위가 Class)
 - 간단하게 말하면 객체 지향 프로그래밍 언어는 하나의 기능(class)을 객체(object)로 만들고, 이러한 객체(object)들을 결합해서 하나의 프로그램을 만드는 것이다.
 - 예를 들고 설명하자면 핸드폰을 만드는 설계도는 Class인 것이고, 설계도로 만든 핸드폰이 Object인 것 이다.
 - 현실세계의 객체들을 시스템화 하는 방법론

## Object(객체)
 - 우리가 인식할 수 있는 모든 것이 객체다
 - 객체의 식별성(identification), 상태(state)의 행동(behavior)를 가지고 있다. 구체화(calss에게 받음)하는 형태의 프로그래밍이 OOP이다.

## Class
 - 객체를 정의하는 틀 or 설계도
 - 이곳에는 여러 객체를 생성하여 사용한다.
 - 클래스는 객체의 상태를 나타내는 필드(bean)와 객체의 행동(app)을 나타내는 메소드로 구성된다.
	- 메소드는 어떤 작업을 수행하기 위한 명령문의 집합

## abstraction(추상화)
 - 공통의 속성, 기능을 묶어서 이름을 붙이는 것
 - 추상화는 추상클래스, 인터페이스를 통해 구현한다.
	- 추상클래스 : 추상메소드를 하나 이상 포함한 추상 클래스, 인터페이스의 구현이 가능
	- 인터페이스 : 추상메소드만을 포함한 추상클래스, 다중 상속 가능, 추상클래스 구현 불가능, private값을 가지지 못함
 - 추상화는 객체들의 공통된 특징을 파악하여 정의해 놓은 설계 기법이다.
 - Java 8부터는 인터페이스 안에 default 선언을 하면 body가 있는 메소드도 선언이 가능하다.

## [Generalization(일반화)/Inheritance(상속)](#상속)
 - 부모 클래스의 변수와 메소드를 자식 클래스가 전부 물려받는 것(상위 클래스의 모든 멤버를 하위 클래스가 물려받는 것)
 - 재사용성과 코드의 간결성 향상(코드의 중복성을 없애기 위함)
 - 중복이 많다면 유지보수에서도 많은 비용이 발생한다.
	- 자식 클래스 설계시 멤버를 미리 부모 클래스에 작성하면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 됨
	- 이를 토대로 클래스간의 계층적 관계를 구성하고 다형성의 문법적 토대를 마련함

## [Specialization(구체적)/전문화](#형변환)
 - 상위 클래스 유형을 하위 클래스 유형으로 변환하는 것을 말한다.
 - 일반적인 형식에서 특정 형식으로 바뀌는 것으로 범위가 좁혀지는데 이를 다운캐스팅이라고 한다.
 - 자바컴파일러가 구체적 캐스팅을 요청하는데 이것이 명시적 캐스팅이라고 한다.

## Realization(실체화)- interface
 - 추상화형태의 객체를 상속하여 자신이 사용하고자하는 구현방법에 따라 오버라이딩 하여 내용을 완성하는 것
 - 인터페이스의 추상메소드를 오버라이딩해서 완성시킴
 
## Association(연관)
 - 객체 또는 클래스가 다른 객체 또는 클래스와 의미의 관계를 가질 수 있다.
	 - 집합연관(Aggregation)
		- 전체/부분 관계를 모델링 하는 경우 한 클래스는 더큰 것을 대표하고, 그것은 더 작은것들로 이루어져 있다.
	 - 복합연관(Compositon)
		- 단순한 집합연관은 전적으로 개념적이며 전체와 부분을 구분하는 것 이상의 어떤 것도 수행하지 않는다.

## Dependency(의존성)
 - A클래스 기능을 수행하기 위해 B클래스의 객체를 필요할 때, A클래스는 B클래스의 의존성을 가진다. 이것이 의존성 주입이다.
 - 의존성 주입은 내부에서 인스턴스를 생성하는 것이 아닌, 외부에서 주입하는 것이다.
	- 의존성을 외부에서 주입받으면 이런 장점을 가진다.
	- 코드의 재활용성이 높아짐
	- 단위테스트가 용이해짐
	- 객체 간의 의존성을 줄여줌
	- 객체 간의 결합도를 낮춰줌

## Polymorphism(다형성)
 - Poly(다양한) + morphism(변형)의 합성어
 - 하나의 객체가 여러가지 타입을 가질 수 있는 것
 - 자바에서는 한 레퍼런스 변수가 다른 형태의 객체를 참조 가능 한 것을 말한다.
 - 오버로딩, 오버라이딩, 업캐스팅, 다운캐스팅등의 방법이 있다.
	- 오버라이딩 : 부모클래스에서 상속받은 자식 클래스에서 부모클래스에서 만들어진 메소드를 자식클래스에서 다시 재정의해서 사용하는 것
	- 오버로딩
		- 하나의 인터페이스로 다양한 활용이가능
		- 이름은 하나만 호출하더라도 주는 값이 다르면 다른타입의 결과를 구현함
		- variable = parameter, argument
			- parameter : call by value로 동작함, 숫자 값
			- argumanet : call by refernect로 동작함, 변수 값
	- 오버로딩이 가능하려면 메소드끼리 이름은 같지만 매개변수갯수나 데이터타입이 달라야 한다.

## Encapuslation /절차은익/ 정보은익(캡슐화)
 - 객체의 변수 및 메소드를 외부객체가 함부로 건드리지 못하도록 감싸는 개념
 - 때문에 클래스를 우리가 만들 때 이 클래스에서 만들어진 객체가 특정 목적을 잘 수행할 수 있도록 사용할 변수와 그 변수를 가지고 메소드를 관련성이 있도록 구성해야 한다.
 - 캡슐화 하는 목적은 정보은닉이 주를 이루는데, 유저정보가 public으로 선언되어 있다면, 아무나 접근이 가능해 유저정보를 변경 할 수있다. 그렇게 private로 데이터를 접근을 제한해야한다.
 이렇게 보호된 변수는 getter나 setter 등의 메소드를 통해서만 간접적으로 접근이 가능해진다.
 - public : 어디서든 접근가능
 - private : 해당 클래스에서만 접근이 가능함
 - protected : 같은 패키지 내에서만 접근이 가능함
 - 캡슐화와 정보은닉을 묶어서 말하는 경우도 있지만, 정보은닉은 캡슐화에서 파생된 보조 개념이고 캡슐화 != 정보은닉이다.


<hr />

# 형변환

## primitive  형변환

- int, byte, double와 같은 자바에서 기본적으로 제공해주는 타입의 형변환이다.
- 이런 타입은 class가 아니며 상속으로 재가공을 하는 것이 아닌 값을 복사해서 온다.

## reference의 형변환

```
동물
 |
 -- 사람
```

- 이라면 동물 a = new 사람은 가능
- 사람 b = new 동물은 불가능
- reference는 개념적으로 형변환을 한다.
- 하위가 상위를 대체 가능(자식을 부모가 대체하면 효자)
- 상위는 하위를 대체 불가능(부모가 자식을 대체하면 불효자)

-[관련자료 Call by시리즈들](#Call by 간단정리)


<hr />


# Method signature(메소드 시그니처)
Java에서 이것은 메서드의 정의에서 method name, method list의 조합
이것이 중요한 이유는 오버로딩 때문
Java 컴파일러는 method이름과 argumanet list를 통하여 method간의 차이를 식별함

# Constructor 
- 객체는 서로다른 상태를 가진다
- 상태값을 준다.
- 객체지향에 생성전부터 값을 주는거는 맞지않아서 생성 후에 값을 줌(오버로딩을 통하여)


<hr />


# UML
통합 모델링 언어(UML, 영어: Unified Modeling Language)는 소프트웨어 공학에서 사용되는 표준화된 범용 모델링 언어이다
UML은 소프트웨어 집약 시스템의 시각적 모델을 만들기 위한 도안 표기법을 포함한다

### Object Model
- 사내시스템을 모델링한다하면

#### Bean
- 명사, static Model
	- 이름
	- 직급
	- 부서번호등등..
- bean은 실행하지 않는다.
- field, method를 가진다

#### 행동
- 동사, dynamic Moodel
	- 개발한다.
	- 응대한다. 등등...
- 실행을 한다.(Test, APP)


# domain
## 도메인 객체
- 개발하고자 하는 영역을 분석하고, 분석의 결과로 도출된 객체들을 일컫는 것
- 모델링하는것?
	- 예를 들면 쇼핑몰
		1. 상품등록
		2. 회원이 상품구매
		3. 하나의 구매 여러상품구매가능
	- 이렇게 도출되는 것이 도메인 객체

# .(dot)
- 현재 폴더

# [new](#메모리)
- class 타입의 instance를 생성해주는 역할
- new 연산자를 통해 Heap영역에 데이터를 저장할 공간을 할당 받고 reference value(참조값)을 객체에게 반환하여 주고 이어서 생성자를 호출함

```
  A	   a	    =			new				    A();
자료형 참조값저장	Heap할당,인스턴스생성,참조값 a에게 리턴		생성자 호출
```

# Call by 간단정리

### value
- 장점 : 복사하여 처리, 안전함, 원래값이 보존
- 단점 : 복사하여서 메모리 사용량 증가

### reference
- 장점 : 복사하지 않고 직접 참조를 하여 빠름
- 단점 : 직접 참조를 하기에 원래값이 영향을 받음(리스크)


<hr />


# Semantic Versioning Specification(SemVer)
- 소프트웨어는 반드시 공개 API를 선언한다. 코드로 선언하거나, 문서로 명시해야 한다.
- Nomal Version은 X.Y.Z형태이며 음수가 아닌 정수여야 하며 앞에 0이 붙으면 안되고 각 수는 증가한다
- 배포하면 그 버전의 내용은 절대 변경해서는 안된다
- 0.Y.Z는 초기 개발을 위해서 쓴다.
- 1.0.0 버전은 공개 API를 정의한다. 이후 버전은 배포한 공개 API에서 어떻게 바뀌었는지 올린다.

### major version
- 기존 api가 변경/삭제 되었기 때문에 update하면 동작하지 않을 수 있다는 의미
- Major version이 올라가면 Minor, Patch는 반드시 0이 되어야 한다.

### minor version
- 이전 버전과 호환되는 방식으로 API가 추가되었으니 살펴보라는 의미
- Minor version이 올라가면 Patch는 반드시 0이 되어야 한다.

### patch version
- 이전 버전과 호환되는 버그 수정했을 경우


<hr />


# API
### api(Application Programming Interface)
api는 컴퓨터나 소프트웨어를 서로 연결한다.
예를 들면 손님(프로그램)이 웨이터(API)에게 주문을하면 주방(API 제공자, 공공포탈등등)에게 주문을 전달하고, 주방에서 다시 웨이터(API)가 주문을 음식을 가져온다.
API를 사용하는 방법과 용도에 따라 openApi와 restApi가 있다

### openApi제공 이유
예를들어 간편로그인이 제공이 되는데 이 경우 원본이되는 카카오톡이나 네이버를 탈퇴하면 다른 수 많은 사이트도 포기하는 상황이 있기 때문에, 플랫폼 이탈율을 줄일 수 있습니다.


<hr />

# 에러종료(error)

## 컴파일타임에러(Compile-time Error)
- 컴파일시 발생하는 에러
- 컴파일러는 구문 오류로 프로그램을 컴파일 할 수 없다.
- 대체로 문법상 에러
- **에러가 발생한 부분을 알려준다**
- 컴파일 에러의 대표 예)
	- ;가 누락된 문법 에러(Systax 오류)
	- 괄호가 안 맞는 등 구문 에러
	- classpath에 누락 ㅚㄴ 클래스(컴파일시)

## 런타임에러(Run-time Error)
- 실행 시 발생하는 에러
- 프로그램이 컴파일 된 후 실행하면서 에러 발생
- 대체로 개발 시 설게 미숙(논리적)으로 발생하는 에러
- **에러 발생 시 프로그래머가 역추적해서 원인 확인 해야함**
- 런타임 에러의 대표 예)
	- NullPointerException
	- 무한루프
	- 0으로 나누기


<hr />


# public static void main(String[] args)의 의미
## public
- 제한자 부분으로 모든 함수의 앞에는 이 함수를 어디에서 접근할 수 있는지 범위를 지정
- 제한자로 public, private, protected 종류를 지정할수 있지만, main 함수만은 public을 지정해야함
	- public
	- 이유로는 main함수는 모든 실행 프로그램의 기본이 되어야함
	- 때문에 어디에서든 접근이 가능해야함

<details>
	<summary>다른 제한자</summary>
	<div markdwon="1">
		<table>
			<th bgcolor="gray">접근제한 함수</th>
			<th bgcolor="gray">기능</th>
			<tr>
				<td>public</td>
				<td>모든 곳에서 접근 가능</td>
			</tr>
			<tr>
				<td>private</td>
				<td>자기 자신 클래스 에서만 접근 가능</td>
			</tr>
			<tr>
				<td>protected</td>
				<td>자기 자신 클래스와 상속된 클래스에서 접근 가능</td>
			</tr>
		</table>
	</div>
</details>

## static
- 변수나 함수를 메모리에 할당하는 방법은 2가지가 있는데, 첫번째는 static영역에 선언, 다른거는 heap영역에 선언(new연산자)
- main 메소드는 프로그램의 기본이 되는 함수이여서 Gc에 의해 정리가 안되도록 static으로 선언하여 메모리에 항상 있도록 설정
	- static
	- 프로그램실행되는 순간 메모리 할당
	- GC에게 정리 대상이 아님

	- heap
	- 연산이 실행되는 순간
	- Gc에 의해 정리 대상

## void
- void는 함수가 끝날 때 리턴값이 없다는 뜻
- main 함수는 왜 void여야 하는가
	- main은 함수가 종료되면(비정상적 종료) 프로그램이 종료된다
	- 프로그램이 종료가 되기때문에, return값의 의미를 지닐수가 없다

- 일반 함수들은 리턴값을 변수에 담아 다음단계를 진행할 수 있기 때문에, 다른 int, char타입이 사용이 가능하다

## main
- 자바의 시작은 main 함수명으로 시작해야 한다.
- 문법이다.

## String[] args
- args 문자열을 배열로 사용한다는 의미다
- args는 변수명이여서 args가 아니여도 되지만 String[] args구문은 뺄 수 없다.
- 이유는 main 함수는 다른 일반함수들을 호출하여 입력값을 받아오기 때문이다.

### 자료형DataType
- 기본자료형(8개)
- 참조자료형(그외전부)

### [캐스팅](#형변환)
- 명시적 형변환(익스플릭시)
- 묵시적 형변환
    - 정수를 계산을하면 int로 바뀐다
    - 작은데이터타입과 큰데이터타입 연산은 큰데이터타입으로 간다
    ```
    byte b1 =10;
    byte b2 =10;

    int i = b1 + b2;
    ```

<hr />


# 삼항연산자
- int a =(5 < 4) ? 50 : 40;
   변수   조건문   참 : 거짓
- a는 조건문이 참이라면 50, 거짓이라면 40이라는 뜻

- 삼항연산자를 사용하여 코드라인이 줄어도 컴파일 속도가 빨라지는 것이 아니다.
- 삼항연산자를 중복해서 처리할 경우, 가독성이 떨어질 수도 있다.


<hr />


# 상속
- 동물의 '움직이다' 라는 특징을 모든 포유류,조류,파충류가 물려받는것
- 즉 move()라는 메소드를 모든 객체가 사용 가능

## Extends(상속)
- extends가 상속의 대표적 형태
- 부모의 메소드를 그대로 사용가능, 오버라이딩 할 필요X
- 부모에 구현되 있는 것을 직접 사용 가능
- 다중상속이 불가능

## Implements
- implements의 가장 큰 특징은 부모의 메소드를 오버라이딩해야함
- implements는 다중상속을 대신해줌

## 정리
- extends는 클래스를 확장하는 거고 implements는 인터페이스를 구현하는 것이다.
- 인터페이스와 보통 클래스의 차이는 인터페이스는 정의한 메소드를 구현하지 않아도 된다.
- 인터페이스를 상속받는 클래스에서 인터페이스에 정의된 메소드를 구현하면 된다.

- 이어서 this와 super를 보자

# this & super
- this와 super는 생성자 호출에 사용되는 메소드이다
- 만약 오버로딩 된 생성자를 선택해야 하는 경우 this super에 호출하길 원하는 생성자 인수를 대입하면 된다.

## this()
- 현재 클래스 안의 개체를 가져오는 참조 변수

## super()
- 자식 클래스에서 부모 클래스 개체를 가져오는데 사용하는 참조 변수

## 예제

### SuperThisTest

```
class JuniorHighSchool {
	//Field
	String name = "대한민국중학교";

	//Constructor
	public JuniorHighSchool(){
	}
	
	//Method
	public void schoolName(){
		System.our.println("중학교 이름 : "+name);
	}
}// end of class

class HighSchool extends JuniorHighSchool {
	//Field
	String name = "대한민국고등학교";
	
	//Constructor
	public HighSchool(){
	}

	//Constructor O/L
	public HighSchool(String str){
		name =str;
	}
	//==> 위의 생성자와 아래의 생성자를 readability 측면에서 살펴보면
	//public HighSchool(String name){
	// this.name = name;
	//}

	//Method
	public void SchoolName(){
		System.out.println("중학교 이름 : "+super.name);
		System.out.println("고등학교 이름 : "+this.name);
		System.out.println("고등교 이름 : "+name);
	}
}// end of class

public class SuperThisTest {
	//main method
	public static void main(String args[]){
		HighSchool hs01 = new HighSchool();
		hs01.schoolName();

		System.out.println("===========================================");

		HighSchool hs02 = new HighSchool("서울고등학교");
		hs02.schoolName();
	}// end of main
}// end of class

```

### 결과 값

<img src="https://user-images.githubusercontent.com/92348108/154439951-59e11254-6c3f-4bd7-aedd-11cdbe489a33.png" />

- 이 예제에서 super.name은 HighSchool을 extends한 JuniorHighSchool의 name을 호출 하는 것이다.

- this.name은 현재 자신 HighSchool의 name을 호출 하는것이다.

- name은 앞에 this.이 생략되 있는 것으로 현재 자신 HighSchool의 name을 호출 하는것이다.


<hr />


# 인스턴스 변수
- {} 단위에서 생사가 결정 되어 있음

## 전역변수(인스턴스변수)
- 객체 전반에 걸쳐 영향력이 있는 변수
- 객체의 매소드내에서 사용하는 변수
- 선언시점 null로 해도 상관없음

- 즉, 자바에서는 Field 값

## 지역변수(로컬변수)
- 메소드내에서만 살아있는 변수
- 선언시점에 값을 지정해야함


<hr />

# [statc, stack, heap](#메모리)
- java에서는 위에서 아래로 이동하며 메모리에는 static 부터 올라간다.
- static에 올라간 이후에 main method가 실행이 된다

## 예제로 알아보기


- 참고 이미지

<img src="https://user-images.githubusercontent.com/92348108/154665861-bf175e58-895b-497d-8085-8d84967b82e3.png" alt="" />


```
public class  ObjectTest  {
	//Field
	int i;
	static int j;

	//Static Block
	static{
		System.out.println("A> :j = "+j);
		j=1;
		System.out.println("B> :j = "+j);
	}

	//constructor
	public ObjectTest(){
		System.out.println("ObjectTest default Constructor :: C>  : i = "+i);
	}
	//method(instance method)
	public void printlnstanceInt(){
		System.out.println("D> :i = "+i);
	}

	//static method
	public static void printClassInt(){
		System.out.println("E> :j = "+j);
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("|===========================================|");
		ObjectTest obj1 = new ObjectTest();
		obj1.printlnstanceInt();
		obj1.printClassInt();
		System.out.println("|===========================================|");
		ObjectTest.printClassInt();

		//==> 위의 출력결과를 이해한다면 아래의 주석풀고 샐행한다면 결과를 예측하면
		//System.out.println("|===========================================|");
		ObjectTest obj2 = new ObjectTest();
		obj2.i = 100;
		System.out.println("obj2.i = "+obj2.i +": obj1.i = "+obj1.i);

		System.out.println("|===========================================|");
		obj2.j= 3333;
		System.out.println("obj2.j = "+obj2.j +": obj1.j = "+obj1.j);
		System.out.println("ObjectTest.j = "+ObjectTest.j);
	}//main
}//class

```

- 이곳에서 int j는 static이 선언되어서 제일 먼저 메모리에서 static에 기록이 되고 다른 메소드변수값에 같이 사용이 된다
- main 에서 obj1, obj2 인스턴스가 heap에 생성이되고, 주소값이 stack에 기록이 된다
- obj1.i와 obj2.i는 heap에 각각의 인스턴스에 생성이되어 obj2.i의 값을 바꾸어도 obj1.i의 값은 바뀌지 않는다.
- obj2.j와 obj2.j는 static에 있는 j값을 사용하고 있어서 ojb2.j의 값을 바꾸면 obj1.j의 값도 같이 바뀌게 된다.


<hr />


# [~is a ~ & ~has a ~](#상속)

<details>
	<summary>자세히 보기</summary>
	<div markdwon="1">
		<table>
			<th bgcolor="gray"></th>
			<th bgcolor="gray">설명</th>
			<tr>
				<td>~ is a ~</td>
				<td>이것은 상속 관계로 extends처럼 확장하여 만들었을때 해당된다</td>
			</tr>
			<tr>
				<td> ~has a ~</td>
				<td>이것은 서로 완전 다른 class 이더라도 import나 기본default값을 통하여 호출하여 인스턴스를 생성할 때 말한다.</td>
			</tr>
		</table>
	</div>
</details>


<hr />



# 아스키타입

데이터 타입은 크게 정수형, 실수형, 논리형, 문자형이 있다.]
문자의 아스키코드타입데이터 바코드 버전이다


<hr />


# abstract class, method && interface

## abstarct class
- abstract class는 abstract method가 존재한다면 사용해야한다.
- 또한 이것을 확장하는 자식 개체들은 반드시 abstract 메소드를 오버라이딩 해야한다.

```
abstract class A{
	public abstract void b();
}

class B extends a{
	public void b(){
		System.out.print("오버라이딩 반드시 해야함");
	}
}
```

## interface
- abstract class에서 abstract기능만 빼가지고 abstract method를 interface로 만드는 것이다
- 궁극적인 이유는 모듈화를 위해서다(여러군대의 재사용성)
- interface도 abstract처럼 반드시 오버라이딩을 해야한다.
- interface는 abstract를 쓰지 않아도 이미 내부적으로 가지고 있다.
- 필드를 만든다면 반드시 상수를 강요한다.

```
interface Fee{
	[public final static] String bbb = "interface정의";
	//==> 이것은 public final static의 특성을 반드시 가진다.
	//==> 무조건 상수로 정의해야한다.

	public void b();
}

class B extends A implements b{
	public void b(){
		System.out.println("오버라이딩 반드시 해야함")
	}
}

```


# reference 형변환(equals)

## 예제

```
B b1 = new B(1, "홍");
B b2 = new B(1, "홍");

b1 == b2 ==> F
b1.equals(b2) ==> F
```

## 설명
- 모든 java class는 compile시에 Objcet를 하이락키로 가지고있다(extends Object를 하고있다) => 상위로 가지고 있다
- 때문에 Object에 존재하는 equals를 사용할 수 있다.
- equals를 재정의(오버라이딩)은 추상화(abstract)가 아니여서 반드시 할 필요는 없다. 하지만 비교를 하고싶다면 재정의해도 된다.


<details>
	<summary>설명 펼쳐보기</summary>
	<div markdwon="1">
		<img src="https://user-images.githubusercontent.com/92348108/155113890-7f217106-fc61-4978-95d6-3778f61644dd.jpg" alt="" />
	</div>
</details>


<hr />


# [try catch(예외처리)](#에러종료(error))

## try catch
- runtime error를 잡는 방법
- unchecked error 잡기 => checked error보다 안좋은 상황이 보일 상황이 많다
- 때문에 잘 처리해야함

## Exception
- 여러가지 exception이 존재함
- 원하는 것으로 확장하여 overroding도 가능함

## throws
- Exceoption과 같이 씀
- exceoption을 예외상황 발생시 new로 새로 만들고 try catch를 사용 해서 만들어 놓은 exeoption에 접근하고
	그것의 message를 retrun받아서 원하는 방식으로 대처하는 방법
	
## 예시

```
public void call(int time) throws IllegalArgumentException {
		try {
			if(time>0) {
				if(battery<1) {
					throw new IllegalArgumentException("잔여 배터리 없음");
				}
				battery -= time*0.5;		
				if(battery<0) {	
					battery =0;
				}
				System.out.println("통화 시간 : "+time);
			} else {
				throw new IllegalArgumentException("통화시간 입력 오류");
			}
		} catch(IllegalArgumentException e) {
			
			//e.printStackTrace();
			if(e.getMessage().equals("잔여 배터리 없음")) {
				System.out.println("잔여 배터리 없음 충전하세요");
				return;
			}
			if(e.getMessage().equals("통화시간 입력 오류")) {
				System.out.println("통화시간 입력 오류");
				return;
			}
		}
	}

```

- IllegalArgumentException으로 thorws 한다고 붙임
- throw new 선언
- message 날라갈것을 보냄
- return 받아서 받은 return값 체크후에 원하는 것 



<hr />


# Thread
- 컴퓨터는 한번에 하나의 일밖에 못하지만 프로세스를 여러개 우리눈에 보이기에는 동시일 정도로 빠르게 하나씩 실행하여서
- 동시 작동하는 것처럼 보인다 이것이 멀티 스레드의 개념이다

## Main Thread
- Main Thread가 main() 메소드부터 실행한다. 무조건
- 멀티스레드는 병렬로 실행하는것처럼 보이게 한다
- 메인스레이드가 종료되더라도 실행중인 스레드가 있다면 프로세스는 종료되지 않는다.


## Daemon Thread
- Main Thread를 보조역할 하는 스레드
- Main Thread가 끝나면 필요가 없기에 강제로 종료가 됨
- 해당 스레드가 계속 돌아가도록 setDaemon(true);로 설정하면됨

## 우선순위
- 동시성과 병렬성



<hr />


# RunTimeException
- 사용자 커스텀 예외코드에서 사용한다.
- 다른 Exceoption은 이미 자바에서 예측이 가능해서 컴파일시에 에러를 낼수 있다.
- RunTimeExceiotion은 발생 할 수도 있고, 안할 수도 있어서, 컴파일시에 에러를 찾을 수 없다.

## 예시

```
public class DataFormatException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataFormatException(){
	}
	
	public DataFormatException(String message){
		super(message);
	}
	
}
```

- extends 해서 사용자커스텀예외클래스를 생성한다.
- 다른곳은 code도 들고오는데 아직 모르겠다.
- 사용한 곳에 throws를 하지 않고 throw를 할 수 있다.


<hr />


# Java.io
- Stream에 대해 데이터 흐름을 잘 보면된다.
- 단방향 개념이다
- 입력받는 것은 입력 스트림, 내보내는 것는 출력 스트림

- 주요 사용클래스

<details>
	<summary>주요 사용클래스</summary>
	<div markdwon="1">
		<table>
			<th bgcolor="gray">io 주요 클래스</th>
			<th bgcolor="gray">설명</th>
			<tr>
				<td>File</td>
				<td>파일 시스템의 파일 정보를 얻기 위한 클래스</td>
			</tr>
			<tr>
				<td>Console</td>
				<td>콘솔로부터 문자를 입출력하기 위한 클래스</td>
			</tr>
			<tr>
				<td bgcolor="gray">InputStream/OutputStream</td>
				<td bgcolor="gray">바이트 단위 입출력을 위한 최상위 입출력 스트림</td>
			</tr>
			<tr>
				<td>File,Data,Object,Print,Buffered//~inputStream</td>
				<td>바이트 단위 입출력 위한 하위 스트림 클래스</td>
			</tr>
			<tr>
				<td>Reader/Writer</td>
				<td>문자 단위 입출력을 위한 최상위 입출력 스트림</td>
			</tr>
			<tr>
				<td bgcolor="gray">Reader/Writer</td>
				<td bgcolor="gray">문자 단위 입출력을 위한 최상위 입출력 스트림</td>
			</tr>
			<tr>
				<td>File,Data,Object,Print,Buffered//~~Reader/Writer</td>
				<td>문자 단위 입출력을 위한 하위 입출력 스트림</td>
			</tr>
		</table>
	</div>
</details>


## Flush()
- 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비우는 것
- 즉 버퍼된 출력 바이트를 장제로 사용하게 함

## Close()
- 파일IO는 프로그램에서 메모리를 사용 하는것이 아닌 하드디스크 자원을 사용 하는것
- 때문에 커넥션하고 사용 후에는 리소스 반환을 해야함(close)
- **반환을 하지 않는다면 서버프그램 종료되기 전까지 다른 프로세스에서는 접근을 할 수 없는 상태가 되어버림**

## Finally { (~~~*** != null ) close() }

```
try{
	코드
} catch(exception e){
	예외 메세지
} finally{
	try{
		if( ~~Stream != null){
			//스트림 닫기
			~~Strea.close();
		}
	} catch(exception e){
}

```

- null이 아닐 때 close() 호출 이유
- 어떤 예외가 발생하든 발생 안하든 input/outputSteam이 반드시 닫히도록 하기 위한것
- 차이점은 예외가 발생했을 때인데, 예외가 발생한다면 단순 반환하는 대신 이 메소드를 호출한 메소드에 예외를 반환하기 전에 두 스트림이 모두 닫힘
- 이렇게 하면 어느 상황이든지 반드시 연결이 닫힘, close가 finally 블록에 있지 않고 시스템이 계속해서 다른 것을 만ㄷ나다 보면 Exceition이 결국 발생해서 오류가 발생 할 수 있음