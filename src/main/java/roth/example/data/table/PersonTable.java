package roth.example.data.table;

import java.util.LinkedList;

import roth.example.data.Db;
import roth.example.data.model.Person;
import roth.lib.java.jdbc.mysql.MysqlDbTable;
import roth.lib.java.jdbc.sql.Select;

public class PersonTable extends MysqlDbTable<Person>
{
	protected Db db;
	
	protected PersonTable(Db db)
	{
		super(Person.class);
		this.db = db;
	}
	
	public static PersonTable get(Db db)
	{
		return new PersonTable(db);
	}

	@Override
	public Db getDb()
	{
		return db;
	}
	
	public Person findById(int id)
	{
		Select select = select();
		select.whereEquals("id", id);
		return findBy(select);	
	}

	public LinkedList<Person> findAllByLastName(String lastName)
	{
		Select select = select();
		select.whereLike("lastName", "%" + lastName + "%");
		return findAllBy(select);
	}
}
