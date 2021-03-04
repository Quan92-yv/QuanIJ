package lab.s4_2;

public class Main {
    public static void main(String[] args){
        SinhVien s1 = new SinhVien();
        s1.setId(1);
        s1.setFullName("Ng Van A");
        s1.setTel("012345678");
        s1.setAddress("Cau Giay");

        SinhVien s2= new SinhVien();
        s2.setId(2);
        s2.setFullName("Le Van B");
        s2.setTel("098765432");
        s2.setAddress("My Dinh");

        LopHoc lh = new LopHoc();
        lh.setId(1);
        lh.setName("T2009M");
        lh.setRoom("A8");
        lh.addStudent(s1);
        lh.addStudent(s2);
        lh.printStudents();
    }
}