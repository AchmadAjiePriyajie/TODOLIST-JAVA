package repository;

import entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {

    public Todolist[] data = new Todolist[10];
    @Override
    public Todolist[] getAll() {
        return data;
    }

    public boolean isFull() {
        // cek apakah data penuh?
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                // data masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        // tambahkan ke posisi yang data array nya NULL
        if(isFull()) {
            resizeIfFull();
            add(todolist);
        }else {
            for (var i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = todolist;
                    break;
                }
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length) {
            System.out.println("Gagal menghapus todo ke-" + number);
            return false;
        } else if (data[number - 1] == null) {
            System.out.println("Gagal menghapus todo ke-" + number);
            return false;
        } else {
            for (int i = (number - 1); i < data.length; i++) {
                if (i == (data.length - 1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            System.out.println("Sukses menghapus todo ke-" + number);
            return true;
        }
    }
}
