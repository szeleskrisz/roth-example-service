package roth.example.data.table;

import java.util.List;

import roth.example.data.Db;
import roth.example.data.model.MedicalRecord;
import roth.lib.java.jdbc.mysql.MysqlDbTable;
import roth.lib.java.jdbc.sql.Select;

public class MedicalRecordTable extends MysqlDbTable<MedicalRecord> 
{
	protected Db db;
	
	protected MedicalRecordTable(Db db) 
	{		
		super(MedicalRecord.class);
		this.db = db;
	}
	
	public static MedicalRecordTable get(Db db)
	{
		return new MedicalRecordTable(db);
	}

	@Override
	public Db getDb()
	{
		return db;
	}
	
	public List<MedicalRecord> findAllByPetId(int id)
	{
		Select selectAll = select();				
		selectAll.whereEquals("animalId", id);					
		return findAllBy(selectAll);
	}
	
	public double getMedicalCostsPerPet(int id)
	{
		Select select = select();		
		select.columnSqlAs("SUM(fee)", "totalFee");
		select.whereEquals("animalId", id);
		return findBy(select, Double.class);
	}

}
