charset utf8; -- 윈도 명령 프롬프트의 기본 문자셋이 euckr이므로 utf8로 문자셋 변경
USE springmvcDB; 

CREATE TABLE IF NOT EXISTS book(
    b_bookId VARCHAR(10) NOT NULL,
    b_name VARCHAR(30),
    b_unitPrice INTEGER,
    b_author VARCHAR(50),
    b_description TEXT,
    b_publisher VARCHAR(20),
    b_category VARCHAR(20),
    b_unitsInStock LONG,    
    b_releaseDate VARCHAR(20),
    b_condition VARCHAR(20),
    b_fileName VARCHAR(20),
    PRIMARY KEY (b_bookId)
)DEFAULT CHARSET=utf8;
 

DELETE FROM book; 

INSERT INTO book VALUES('ISBN1234', '스프링 코딩 공작소', 38000, '송미영', '스프링 MVC는 웹 애플리케이션 개발 전용 프레임워크로, 스프링에서 제공하는 많은 기능을 자유롭게 확장해 사용할 수 있으며 영역별로 개발할 수 있다는 장점이 있다. 책에서는 이러한 스프링 MVC를 이용해 도서 쇼핑몰을 처음부터 끝까지 직접 만들어 볼 수 있게 구성했다. 또한, MultipartFile, RESTful 웹 서비스, 스프링 웹 플로우, 스프링 시큐리티, Log4j 등을 사용하기 때문에 다양한 스프링 기능도 함께 익힐 수 있다. 책을 따라 실습하다 보면 스프링 MVC의 개념과 원리를 자연스레 익힐 수 있을 것이다. 스프링 MVC가 처음이거나 스프링 MVC로 직접 웹 애플리케이션을 만들어 보고 싶은 분에게 추천한다.','길벗','IT전문서', 1000,'2020/05/29','','ISBN1234.png');

INSERT INTO book VALUES('ISBN1235', '아는 만큼 보이는 IT 지식', 22000, '민완기', '시각 디자인을 전공한 10년 차 개발자입니다. 비전공자로 IT에 대해 물어볼 곳도, 사수도 없던 시절의 서러움을 기억해 과거의 자신과 같은 이들을 위해 책을 집필했습니다. 스타트업 현장에서 다년 간 프로덕트를 만든 경험을 바탕으로 현재는 디자인과 개발을 아우르며 다양한 기업과 일하고 있습니다','길벗','IT전문서',1000, '2024/10/24','', 'ISBN1235.png'); 
INSERT INTO book VALUES('ISBN1236', '세상에서 가장 쉬운 코딩책', 25000, '위캔코딩', '디자이너를 꿈꾸며 의류학과를 졸업하고 꿈에 그리던 패션회사에 입사했으나 기쁨도 잠시, 열심히 일해도 연봉은 제자리, 성장도 제자리를 맴도는 듯했다. 설상가상 코로나의 영향으로 회사의 앞날이 불안정해지자 이렇게 있다가는 안 되겠다 싶어 개발을 배우기로 마음먹었다. 사표를 내고 독한 마음으로 6개월 동안 코딩과 개발 공부를 했고, 동시에 정보처리기사도 준비해 단번에 합격했다. 하늘은 준비된 자의 편이라 했던가. 이력서와 면접 준비도 열심히 한 결과, 그해 바로 기업 ERP시스템을 만드는 IT회사에 연봉 1,000만 원을 올려 개발자로 입사하게 된다. 한 번도 생각해본 적 없는 개발자 업무였지만 하다 보니 새로운 미래를 꿈꾸게 됐고, 그렇게 코딩 지식을 발판 삼아 서강대학교 AI 빅데이터 MBA에 합격하여 현재는 데이터 관련 공부를 하고 있다. 회사생활과 대학원 공부를 하면서 자신처럼 미래를 고민하는 사람들, 그런데 개발이 어려울 것 같아 이러지도 저러지도 못하는 사람들을 위해 스스로 공부했던 노하우를 정리해 텀블벅에 \'쉽게 배우는 코딩, 비전공자 개발자 되는 법\'이라는 프로젝트로 펀딩을 진행했다. 텀블벅 펀딩은 11,688%라는 어마어마한 성과를 내며 사람들의 입소문을 탔고, 이후 와디즈에도 동일한 펀딩을 론칭해 2,276%의 달성률을 만들어냈다. 2022년 8월에는 강의 플랫폼 \'클래스유\'에 코딩 강의를 론칭했으며, \'위캔코딩\' 네이버 카페를 개설하여 코딩을 시작하는 사람들에게 많은 정보와 노하우를 전달하고 있다.', '길벗', 'IT활용서', 1000, '2023/02/15','','ISBN1236.png');
