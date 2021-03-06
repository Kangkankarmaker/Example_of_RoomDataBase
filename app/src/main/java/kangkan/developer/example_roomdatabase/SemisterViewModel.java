package kangkan.developer.example_roomdatabase;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class SemisterViewModel extends AndroidViewModel{

    public Repository myrepository;
    LiveData<List<Semister>> allSemister;

    public SemisterViewModel(@NonNull Application application) {
        super(application);
        myrepository=new Repository(application);
        this.allSemister=myrepository.getAllSemister();
    }

    public LiveData<List<Semister>>GetAllSemister(){
        return allSemister;
    }

    public void InsertSemister(Semister semister){
        myrepository.InsertSemister(semister);
    }

    public void DeleteSemister(Semister semister) {
        myrepository.DeleteSemister(semister);
    }

    public void UpdateSemister(Semister semister) {
        myrepository.UpdateSemister(semister);
    }

}
