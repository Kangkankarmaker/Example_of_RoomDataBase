package kangkan.developer.example_roomdatabase;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class Repository {
    public  SemisterDao semisterDao;
    LiveData<List<Semister>> allSemister;

    Repository(Application application){
        SemisterDatabase db=SemisterDatabase.getDatabase(application);
        semisterDao=db.semisterDao();
        allSemister=semisterDao.getAllsemister();
    }

    public LiveData<List<Semister>> getAllSemister(){
        return  allSemister;
    }


    public void  InsertSemister(Semister semister){
        new InsertTask(semisterDao).execute(semister);

    }

    public void DeleteSemister(Semister semister){
        new DeleteTask(semisterDao).execute(semister);
    }
    public void UpdateSemister(Semister semister){
        new UpdateTask(semisterDao).execute(semister);
    }


    public class  InsertTask extends AsyncTask<Semister,Void,Void>{
        private  SemisterDao semisterDao;

        public InsertTask(SemisterDao semisterDao) {

            this.semisterDao = semisterDao;
        }

        @Override
        protected Void doInBackground(Semister... perams) {

            semisterDao.insert_semister(perams[0]);

            return null;
        }
    }

    public class  DeleteTask extends AsyncTask<Semister,Void,Void>{
        private  SemisterDao semisterDao;

        public DeleteTask(SemisterDao semisterDao) {

            this.semisterDao = semisterDao;
        }

        @Override
        protected Void doInBackground(Semister... perams) {

            semisterDao.delete_semister(perams[0]);

            return null;
        }
    }

    public class  UpdateTask extends AsyncTask<Semister,Void,Void>{
        private  SemisterDao semisterDao;

        public UpdateTask(SemisterDao semisterDao) {

            this.semisterDao = semisterDao;
        }

        @Override
        protected Void doInBackground(Semister... perams) {

            semisterDao.Update_semister(perams[0]);

            return null;
        }
    }


}