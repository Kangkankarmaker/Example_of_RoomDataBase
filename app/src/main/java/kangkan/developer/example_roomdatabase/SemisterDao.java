package kangkan.developer.example_roomdatabase;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface SemisterDao {

    @Insert
    long insert_semister(Semister semister);

    @Update
    void Update_semister(Semister semister);

    @Delete
    void delete_semister(Semister semister);


    @Query("select * from Semister order by semister_name")
    LiveData<List<Semister>> getAllsemister();

    @Query("Delete from semister")
    void deleteAll();

}
