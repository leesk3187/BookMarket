package com.springmvc.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.Book;
import com.springmvc.exception.BookIdException;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private List<Book> listOfBooks = new ArrayList<Book>();
	private JdbcTemplate template;

	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN1234", "������ �ڵ� ���ۼ�", 38000);
		book1.setAuthor("�۹̿�");
		book1.setDescription(
				"������ MVC�� �� ���ø����̼� ���� ���� �����ӿ�ũ��, ���������� �����ϴ� ���� ����� �����Ӱ� Ȯ���� ����� �� ������ �������� ������ �� �ִٴ� ������ �ִ�. å������ �̷��� ������ MVC�� �̿��� ���� ���θ��� ó������ ������ ���� ����� �� �� �ְ� �����ߴ�. ����, MultipartFile, RESTful �� ����, ������ �� �÷ο�, ������ ��ť��Ƽ, Log4j ���� ����ϱ� ������ �پ��� ������ ��ɵ� �Բ� ���� �� �ִ�. å�� ���� �ǽ��ϴ� ���� ������ MVC�� ����� ������ �ڿ����� ���� �� ���� ���̴�. ������ MVC�� ó���̰ų� ������ MVC�� ���� �� ���ø����̼��� ����� ���� ���� �п��� ��õ�Ѵ�.");
		book1.setPublisher("���");
		book1.setCategory("IT������");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2022/12/22");

		Book book2 = new Book("ISBN1235", "�ƴ� ��ŭ ���̴� IT ����", 22000);
		book2.setAuthor("�οϱ�");
		book2.setDescription(
				"�ð� �������� ������ 10�� �� �������Դϴ�. �������ڷ� IT�� ���� ��� ����, ����� ���� ������ �������� ����� ������ �ڽŰ� ���� �̵��� ���� å�� �����߽��ϴ�. ��ŸƮ�� ���忡�� �ٳ� �� ���δ�Ʈ�� ���� ������ �������� ����� �����ΰ� ������ �ƿ츣�� �پ��� ����� ���ϰ� �ֽ��ϴ�");
		book2.setPublisher("���");
		book2.setCategory("IT������");
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2024/10/24");

		Book book3 = new Book("ISBN1236", "���󿡼� ���� ���� �ڵ�å", 28000);
		book3.setAuthor("��ĵ�ڵ�");
		book3.setDescription(
				"�����̳ʸ� �޲ٸ� �Ƿ��а��� �����ϰ� �޿� �׸��� �м�ȸ�翡 �Ի������� ��ݵ� ���, ������ ���ص� ������ ���ڸ�, ���嵵 ���ڸ��� �ɵ��� ���ߴ�. ���󰡻� �ڷγ��� �������� ȸ���� �ճ��� �Ҿ��������� �̷��� �ִٰ��� �� �ǰڴ� �;� ������ ����� �����Ծ���. ��ǥ�� ���� ���� �������� 6���� ���� �ڵ��� ���� ���θ� �߰�, ���ÿ� ����ó����絵 �غ��� �ܹ��� �հ��ߴ�. �ϴ��� �غ�� ���� ���̶� �ߴ���. �̷¼��� ���� �غ� ������ �� ���, ���� �ٷ� ��� ERP�ý����� ����� ITȸ�翡 ���� 1,000�� ���� �÷� �����ڷ� �Ի��ϰ� �ȴ�. �� ���� �����غ� �� ���� ������ ���������� �ϴ� ���� ���ο� �̷��� �޲ٰ� �ư�, �׷��� �ڵ� ������ ���� ��� �������б� AI ������ MBA�� �հ��Ͽ� ����� ������ ���� ���θ� �ϰ� �ִ�. ȸ���Ȱ�� ���п� ���θ� �ϸ鼭 �ڽ�ó�� �̷��� ����ϴ� �����, �׷��� ������ ����� �� ���� �̷����� �������� ���ϴ� ������� ���� ������ �����ߴ� ���Ͽ츦 ������ �Һ���� '���� ���� �ڵ�, �������� ������ �Ǵ� ��'�̶�� ������Ʈ�� �ݵ��� �����ߴ�. �Һ�� �ݵ��� 11,688%��� ���� ������ ���� ������� �Լҹ��� ����, ���� �͵���� ������ �ݵ��� ��Ī�� 2,276%�� �޼����� �����´�. 2022�� 8������ ���� �÷��� 'Ŭ������'�� �ڵ� ���Ǹ� ��Ī������, '��ĵ�ڵ�' ���̹� ī�並 �����Ͽ� �ڵ��� �����ϴ� ����鿡�� ���� ������ ���Ͽ츦 �����ϰ� �ִ�.");
		book3.setPublisher("���");
		book3.setCategory("ITȰ�뼭");
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2023/02/15");

		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}

	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM book";
		List<Book> listOfBooks = template.query(SQL, new BookRowMapper());
		return listOfBooks;
	}

	@Override
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = new ArrayList<Book>();
		String SQL = "SELECT * FROM book where b_category LIKE '%" + category + "%'";
		booksByCategory = template.query(SQL, new BookRowMapper());
		return booksByCategory;
	}

	@Override
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
		Set<Book> booksByPublisher = new HashSet<Book>();
		Set<Book> booksByCategory = new HashSet<Book>();

		Set<String> criterias = filter.keySet();
		if (criterias.contains("publisher")) {
			for (int j = 0; j < filter.get("publisher").size(); j++) {
				String publisherName = filter.get("publisher").get(j);
				String SQL = "SELECT * FROM book where b_publisher LIKE '%" + publisherName + "%'";
				booksByPublisher.addAll(template.query(SQL, new BookRowMapper()));
			}
		}
		if (criterias.contains("category")) {
			for (int i = 0; i < filter.get("category").size(); i++) {
				String category = filter.get("category").get(i);
				String SQL = "SELECT * FROM book where b_category LIKE '%" + category + "%'";
				booksByCategory.addAll(template.query(SQL, new BookRowMapper()));
			}
		}
		booksByCategory.retainAll(booksByPublisher);
		return booksByCategory;
	}

	@Override
	public Book getBookById(String bookId) {
		Book bookInfo = null;
		String SQL = "SELECT count(*) FROM book where b_bookId=?";
		int rowCount = template.queryForObject(SQL, Integer.class, bookId);
		if (rowCount != 0) {
			SQL = "SELECT * FROM book where b_bookId=?";
			bookInfo = template.queryForObject(SQL, new Object[] { bookId }, new BookRowMapper());
		}
		if (bookInfo == null)
			throw new BookIdException(bookId);
		return bookInfo;
	}

	@Override
	public void setNewBook(Book book) {
		String SQL = "INSERT INTO book (b_bookId, b_name, b_unitPrice, b_author, b_description, b_publisher, b_category, b_unitsInStock, b_releaseDate, b_condition, b_fileName) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		template.update(SQL, book.getBookId(), book.getName(), book.getUnitPrice(), book.getAuthor(),
				book.getDescription(), book.getPublisher(), book.getCategory(), book.getUnitsInStock(),
				book.getReleaseDate(), book.getCondition(), book.getFileName());

	}

	@Override
	public void setUpdateBook(Book book) {
		if (book.getFileName() != null) {
			String SQL = "UPDATE Book SET b_name = ?, b_unitPrice = ?, b_author = ?, b_description = ?, b_publisher = ?, b_category = ?, b_unitsInStock = ?, b_releaseDate = ?, b_condition = ?, b_fileName = ? where b_bookId = ? ";

			template.update(SQL, book.getName(), book.getUnitPrice(), book.getAuthor(), book.getDescription(),
					book.getPublisher(), book.getCategory(), book.getUnitsInStock(), book.getReleaseDate(),
					book.getCondition(), book.getFileName(), book.getBookId());
		} else if (book.getFileName() == null) {

			String SQL = "UPDATE Book SET b_name = ?, b_unitPrice = ?, b_author = ?, b_description = ?, b_publisher = ?, b_category = ?, b_unitsInStock = ?, b_releaseDate = ?, b_condition = ? where b_bookId = ? ";

			template.update(SQL, book.getName(), book.getUnitPrice(), book.getAuthor(), book.getDescription(),
					book.getPublisher(), book.getCategory(), book.getUnitsInStock(), book.getReleaseDate(),
					book.getCondition(), book.getBookId());
		}
	}

	@Override
	public void setDeleteBook(String bookID) {
        String SQL = "DELETE from Book where b_bookId = ? ";
        this.template.update(SQL, bookID);
    }
}
