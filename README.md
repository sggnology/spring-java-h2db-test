# spring-java-h2db-test
Spring + Java + h2db (spring+java-h2db 는 처음이라 연습)

# 데이터베이스 initialization 방법
2가지 방법에 대해 알아보자.

## 1. hibernate 의 ddl-auto 기능을 사용하여 초기화 

1. @Entity, @Table 선언을 통해 개체를 등록한다.(e.x `User`..)
2. embedded db(e.x. h2..) 를 사용한다.
3. 개체의 코드를 참조하여 테이블을 생성하게 된다.

> spring.jpa.defer-datasource-initialization 값을 true 로 세팅한다.
  - 기본적으로 data.sql 스크립트가 schema 의 생성보다 먼저 실행되지만, 위 property 를 통해 schema 를 먼저 생성하게끔 우선순위를 변경 할 수 있다.

> spring.jpa.hibernate.ddl-auto 는 db의 형식에 따라, 가지는 기본값(default)이 달라지게 된다.
  - embdedded 일 경우, create-drop 
  - 그 외일 경우, none
  
## 2. schema.sql 을 통해 초기화

1. schema.sql 에 ddl 을 작성하여 준다.(e.x `CREATE TABLE USER...`)

> `h2` 일 경우 spring 은 resources 디렉토리 아래의 data.sql, 과 schema.sql 스크립트를 확인한뒤 실행하여 초기화 하려 한다.
  - 이 때 ddl-auto 와 맞물려 제대로 동작하지 않음으로, ddl-auto 의 값을 `none` 으로 설정한다.
  
### 특이사항
- `h2` db 는 User 가 예약어로 설정되어있음으로, User 테이블이나 column 을 사용하고 싶다면 아래와 같이 작성해야 한다.
  > spring.datasource.url = jdbc:h2:/...;NON_KEYWORDS=USER
    - NON_KEYWORDS 뒤에 선언된 단어를 예약어에서 제외하여 사용가능하게끔 해준다.
- Spring 에서는 hibernate 의 초기화와 schema.sql 스크립트 실행 초기화를 동시에 사용하는 것을 권하지 않는다. 즉 둘중 하나만 사용하는것이 불필요한 에러를 막아준다.


# Application properties
- spring.jpa-defer-datasource-initialization=true : h2 db 의 경우 spring 은 `resources/data.sql, schema.sql` 을 보고 자동실행 하는 config 가 되어있는데 이때 schema.sql 이 먼저 실행되기 위해 설정
