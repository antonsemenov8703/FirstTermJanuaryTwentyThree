package Seminars;

import java.util.ArrayDeque;

public class Task04_0 {

    public static void main(String[] args) {

//        ArrayDeque<String>states = new ArrayDeque<>(4); // написали 6 чтобы специально ограничить
//        states.add("Tulskaya oblast"); //   добавится  вконец очереди (т.к. это будет единственный элемент, то он первый
//        states.addFirst("Moscow"); // специально добавляем первым
//        states.addLast("Kurskaya oblast"); // специально последним
//        states.add("Kirovskaya oblast"); //   добавится  вконец очереди
//        states.add("six"); // вроде как эта функция не добавит элемент, если очередь заполнена до указанного кол-ва
//        states.addLast("seven"); // а эта функция вроде как всё равно добавит элемент.

//        String sFirst = states.getFirst(); // без удаления
//        System.out.println(sFirst);
//        System.out.println(states);
//        String sLast = states.getLast();
//        System.out.println(sLast);


        // поставить на определённое место нельзя

        // Интерфейс   que
        // 1. можем добавлять элемент, 2.можем возвращать без удаления,
        // 3. можем возвращать с удалением из начала очереди. Возвращать с удалением из конца очереди нельзя.


        //Интерфейс Deque определяет следующие методы:
        //void addFirst(E obj): добавляет элемент в начало очереди
        //void addLast(E obj): добавляет элемент obj в конец очереди
        //E getFirst(): возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        //E getLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        //boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        //boolean offerLast(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        //E peekFirst(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
        //E peekLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null
        //E pollFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        //E pollLast(): возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null
        //E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        //void push(E element): добавляет элемент в самое начало очереди
        //E removeFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        //E removeLast(): возвращает с удалением элемент из конца очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        //boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.
        //boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.


        // В deque в отличии от que можем работать с последним элементом

//        for ( String item : states){
//            System.out.println(item);
//        }

//        System.out.println(states.pollLast());

        // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
// перебор без извлечения
        for (Person p : people) {

            System.out.println(p.getName());
//        while(states.peek() != null){ //возвращает без удаления элемент из начала очереди
//            System.out.println(states.pop());
//        }

        }
    }}

class Person{
    public String name;
    public Person(String value){
        name = value;
    }
    String getName(){
        return name;
    }

}