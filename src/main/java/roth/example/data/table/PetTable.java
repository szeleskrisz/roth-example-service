package roth.example.data.table;

import roth.example.data.Db;
import roth.example.data.model.Pet;
import roth.lib.java.jdbc.mysql.MysqlDbTable;
import roth.lib.java.jdbc.sql.Select;

public class PetTable extends MysqlDbTable<Pet> 
{
	protected Db db;
	
	protected PetTable(Db db) 
	{		
		super(Pet.class);
		this.db = db;
	}
	
	public static PetTable get(Db db)
	{
		return new PetTable(db);
	}

	@Override
	public Db getDb()
	{
		return db;
	}
	
	public Pet findById(int id)
	{
		Select select = select();
		select.whereEquals("id", id);
		return findBy(select);
	}	
}
