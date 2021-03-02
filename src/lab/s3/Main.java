package lab.s3;

public class Main {
    public static void main(String[] args){
        Room r = new Room();
        r.setName("Phong so 3");
        r.setPosition("Tang 1");
        r.addUser("Nguyen Thi Van Anh");
        r.addUser("Le Yen Vi");
        r.addUser("Tran Duy Quan");
        r.removeUser(2);
        for(String s: r.users){
            System.out.println(s);
        }
    }
}