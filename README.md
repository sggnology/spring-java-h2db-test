# spring-java-h2db-test
Spring + Java + h2db (spring+java-h2db 는 처음이라 연습)

# Application properties
- spring.datasource.url 의 NON_KEYWORDS=USER : H2 DB 에서는 `USER`는 예약어 이기 때문에 다음과 같은 정의가 필요하다.
- spring.jpa-defer-datasource-initialization=true : h2 db 의 경우 spring 은 `resources/data.sql, schema.sql` 을 보고 자동실행 하는 config 가 되어있는데 이때 schema.sql 이 먼저 실행되기 위해 설정
