package DAO;

import Model.NhanVien;

import java.util.ArrayList;

public class EmployeeDAO implements DAO<NhanVien> {

    @Override
    public boolean save(NhanVien nhanVien) {
        return false;
    }

    @Override
    public boolean add(NhanVien nhanVien) {
        return false;
    }

    @Override
    public boolean update(NhanVien nhanVien) {
        return false;
    }

    @Override
    public boolean delete(NhanVien nhanVien) {
        return false;
    }

    @Override
    public ArrayList<NhanVien> selectAll() {
        return null;
    }

    @Override
    public NhanVien findById(String id) {
        return null;
    }

    @Override
    public ArrayList<NhanVien> searchByCondition(NhanVien condition) {
        return null;
    }
}
