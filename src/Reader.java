public class Reader {
    String name;
    int nomber;
    String faku;
    String data;
    int phone;
    int books;

    public Reader(String name, int nomber, String faku, String data, int phone) {
        this.name = name;
        this.nomber = nomber;
        this.faku = faku;
        this.data = data;
        this.phone = phone;




    }
    public String take (int book){
        this.books = book;
        return name +" взял "+ books;
    }

    public String returnb (){
        return name +" вернул "+ books+"\nУ "+name+"a долг "+ (books-books);
}}
