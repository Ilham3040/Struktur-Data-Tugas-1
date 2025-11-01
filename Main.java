class Node {
  public int value;
  public Node next;

    public Node(int value) {
      this.value = value;
    }

}

class Linked_List {
  public Node head;

  public void insert(int value) {
    Node newNode = new Node(value);
    if(this.head == null) {
      this.head = newNode;
      return;
    }

    Node temp = this.head;
    while(temp.next != null) {
      temp = temp.next;
    }
    temp.next=newNode;
  }

  public void printout() {
    Node temp = this.head;
    while(temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
    }
  }
}



public class Main {

  public static void main(String[] args) {
    int StrukturBaris;
    String KataBaru = "Deklarasi tipe data String";

    int[] empatAngka = {7, 10, 20, 23};
    String[][] Angka = {
      {"1", "3", "5"},{"14", "19", "20"},{"22", "27", "29"}
    };

    Linked_List listAngka = new Linked_List();
    //(22, 19, 44, 60, 72),
    listAngka.insert(22);
    listAngka.insert(19);
    listAngka.insert(44);
    listAngka.insert(60);
    listAngka.insert(72);

    listAngka.printout();


  }
}