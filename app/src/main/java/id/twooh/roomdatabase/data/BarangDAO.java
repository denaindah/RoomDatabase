package id.twooh.roomdatabase.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import id.twooh.roomdatabase.model.Barang;

@Dao
public interface BarangDAO {
// stay tune di next tutorial :D
@Insert(onConflict = OnConflictStrategy.REPLACE)
long insertBarang(Barang barang);
}