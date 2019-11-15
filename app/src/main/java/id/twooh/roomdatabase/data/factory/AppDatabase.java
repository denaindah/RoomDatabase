package id.twooh.roomdatabase.data.factory;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import id.twooh.roomdatabase.data.BarangDAO;
import id.twooh.roomdatabase.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}
