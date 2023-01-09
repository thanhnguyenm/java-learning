package program;

public class LearningString {
    public static void main(String[] args) {
        String myText = "This is the simple text";
        System.out.println(myText.toUpperCase());
        System.out.println(myText.replace("aa", "bb"));

        String myText2 = """
                    This is the paragpch
                <html>
                    <boday>
                                </boday>
                </html>
                """;
        System.out.println(myText2.strip());
        System.out.println(myText2.stripLeading());
        System.out.println(myText2.stripTrailing());
        System.out.println(myText2.stripIndent());
        System.out.println(myText2.trim());

    }
}

// summary java
// 'protected' is used in a package
// String... args => params arguments
// strip(), stripLeading, stripTrailing => smarter than trim()

// static ctr =>
// static {
// ..
// }
//
// String => + / concat / stringbuilder / stringbuffer
// String compare => == / equals (string litteral only) / contentequals (used for  stringbuilder / stringbuffer)

// String a = "abc"; String b= "abc" => a & b same memory, only one memory created
// String a= new String("assd");String b= new String("assd")=> 2 memories created

// Regex with group, and named group , comment  in regex


// Number with BigDecimal, BugIntegre for mre Accuratly
// bit => 0b01 , 0b0110
// add bit 0b01 | 0b10
// Rounding => MathContext,
// Format : NumberFormat.get....t => can be used to parse string, String.format, printf
// default java is decimal, use F for fload, ex : 1.5566F

// switch statement
// int x = switch (a) {
//  case "a" -> 1;
//  case "b" -> {
//    if(ture)
//       yield 2;
//     else
//       yield 4;
//  }
//  default -> 9
// }


//switch check type > jdk 17
// Object obj
//switch(obj) {
//    case String msg -> ...;
//    case Int num -> ...;
//    case Person p && p.Name == "sss" -> ...;
//    case String[] arr -> ...;
//    case null -> ...;
//    case default -> ...;
//}

// Exception
// Error vs Throwable <= Exception <= Checked and Unchecked exceptions (unchecked exception = runtime exception)
// Checked: IOException, SQLException, ClassNotFoundException, DataAccessException
// Unchecked: NullPointerException, ArrayIndexOutOfBound, ArithmeticException, NumberFormatException, IllegalStateException, IllegalArgumentException, InstantiationException
// throw vs throws
// Exception in inheritance
// Parent no throws exceptions => Child No throws Checked Exception
// Parent no throws exceptions => Child can throws Unchecked Exception
// Parent throws exceptions => Child can throws same Exception
// Parent throws exceptions => Child can not throws same Exception
// // Parent throws exceptions => Child can throws other Exception that is a child of parent Exception


// Enum
// define enum as a class => constructor => use this keywork
//enum Card {
//    ONE(1),
//    TWO(2),
//    THREE (3);
//
//    private int value;
//    Card(int value) {
//        this.value = value;
//    }
//    public int getValue() {
//        return switch (this) {
//            case ONE, TWO -> 2;
//            default -> 3
//        };
//    }
//}

//enum Suit {
//    ABC('a'),
//    ABDGD('b'),
//    DHDD ('c');
//
//    private char value;
//    Suit(char value) {
//        this.value = value;
//    }
//}

// get int value => ordinal() function
// when enum has contructor => must define index for enum value
// Enum.valueOf(string) => get enum value from string, string should uppercase.


// anonymous class
// default methods with interface
// instanceof

// Annotations
// Predefined annotations : @Deprecated, @Override, @SuppressWarnings(deprecation and unchecked), @SafeVarargs, @FunctionalInterface
// Annotations That Apply to Other Annotations: @Retention, @Documented, @Target, @Inherited, @Repeatable
// Define custom annotation :
//@interface ClassPreamble {
//    String author();
//    String date();
//    int currentRevision() default 1;
//    String lastModified() default "N/A";
//    String lastModifiedBy() default "N/A";
//    // Note use of array
//    String[] reviewers();
//}

//import java.lang.annotation.ElementType;
//        import java.lang.annotation.Retention;
//        import java.lang.annotation.RetentionPolicy;
//        import java.lang.annotation.Target;
//
//public class TestAnnotationMain {
//
//    // 1. Koi tao mot chu thich can lap lai
//    @Target(ElementType.TYPE)
//    @Retention(RetentionPolicy.RUNTIME)
//    public @interface ReAnno {
//
//        String value();
//    };
//
//    // 2. Khoi tao mot chu thich long nhau
//    @Target(ElementType.TYPE)
//    @Retention(RetentionPolicy.RUNTIME)
//    public @interface ReAnnos {
//
//        ReAnno[] value();
//    }
//
//    // 3. Use repeating annotations
//    @ReAnnos({
//            @ReAnno("Codelearn"),
//            @ReAnno("NMD.SE")})
//    public interface ReAnnotation {
//    }
//
//    public static void main(String[] args) {
//        // 4. Retrieving Annotations via the Filters class
//        ReAnnos rep = ReAnnotation.class.getAnnotation(ReAnnos.class);
//        for (ReAnno re : rep.value()) {
//            System.out.println(re.value());
//        }
//    }
//}

// Type Annotation: @NonNull String str;

// List basic
// List<T> arr = new ArrayList<>();
// List<T> arr = new LinkedList<>();

// remove item in a collection
// using iterator()
//for(Iterator<T> it = collection.iterator()) {
//   T a =  it.next();
//   if (a.getName()=="aaaa") {
//        it.remove();
//   }
//}

// initial list
// List<String> lst = List.of("A","B","C");

// get item by index
// lst.get(index)

// remove an item
// lst.remove(item) or lst.remove(index)

// add, addAll, size

//toarray
// Object[] arr = collection.toArray();
// T[] arr = collection.toArray(new T[0]);

//rewrite equals for contains, index, remove, removeAll... function
//@Override
//public boolean equals(Object o) {
//
//}

// sort
// using IComparer
//collection.sort(new Comparer<T>(){
//    @Override
//    public int compare(T o1, To2) {
//        ...
//    }
//})

// usign lambda
//collection.sort((o1, o2) -> {})

// Collection.sort(líst, new Comparer...)
// Collection.sort(líst, (o1,o2) -> {} ))

// using default comparer => for primitive types
// Collection.sort(líst, Comparator.natualOrder())
// Collection.sort(líst, Comparator.reverseOrder())

// using default comparer => objects
// implements IComparable<T>
// => override method compareTo(T o)

// collection.shuffle()

// Set : 3 types : HashSet, TreeSet, LinkedHashSet
// Set<Employee> s = new HashSet<>();
// Object not override hashcode function => get full list
// Object override hashcode function => can receive not full list

// HashSet sort by hashcode
// LinkedHashSet => keep the order when item is added
// TreeSet => using compareTo function to identify new item need to be added

// Maps => Map, HashMap, TreeMap, ...
// Map<String, Integer> map = new HashMap<>();
// map.put(key, value);
// map.get(key);
// map.values();
// map.keySet();

// for(Map.Entry<Key, vakue> entry: map.entrySet()) {
//      entry.getKey();
//      entry.getValue();
// }

// Generic
//public class Box<T> {
//
//    private T t;
//
//    public void set(T t) {
//        this.t = t;
//    }
//
//    public T get() {
//        return t;
//    }
//
//    public <U extends Number> void inspect(U u){
//        System.out.println("T: " + t.getClass().getName());
//        System.out.println("U: " + u.getClass().getName());
//    }
//
//    public static void main(String[] args) {
//        Box<Integer> integerBox = new Box<Integer>();
//        integerBox.set(new Integer(10));
//        integerBox.inspect("some text"); // error: this is still String!
//    }
//}

//    The preceding example illustrates the use of a type parameter with a single bound, but a type parameter can have multiple bounds:
//
//<T extends B1 & B2 & B3>
//A type variable with multiple bounds is a subtype of all the types listed in the bound. If one of the bounds is a class, it must be specified first. For example:
//
//        Class A { /* ... */ }
//interface B { /* ... */ }
//interface C { /* ... */ }
//
//class D <T extends A & B & C> { /* ... */ }
//    If bound A is not specified first, you get a compile-time error:
//
//class D <T extends B & A & C> { /* ... */ }  // compile-time error

// Upper Bounded Wildcards
//public static void process(List<? extends Foo> list) {
//        for (Foo elem : list) {
//        // ...
//        }
//        }

// Unbounded Wildcards
//public static void printList(List<?> list) {
//    for (Object elem: list)
//        System.out.print(elem + " ");
//    System.out.println();
//}

// Lower Bounded Wildcards
//public static void addNumbers(List<? super Integer> list) {
//    for (int i = 1; i <= 10; i++) {
//        list.add(i);
//    }
//}


// Stream
//str
//.lines()
//.map(Employee::createEmployee)  //static method
//.forEach(System.out::println)

//str
//.lines()
//.map(l -> Employee.createEmployee(l))  //lamda
//.forEach(x -> System.out.println(x))

// List<String> nums = List.of("onr", "two", "three");
// nums
//  .stream()
//  .map(String:length)  or   .map(s -> s.length)
//  .forEach(x -> System.out.println(x))


// Stream.of("onr", "two", "three")
//  .map(String:length)  or   .map(s -> s.length)
//  .forEach(x -> System.out.println(x))

// record Car(String name, String model){}
// Steam.of(new Card("A","1"), new Card("B","2"), new Card("C","1"))
//  .filter(c -> "Testla".equals(c.model))
//  .forEach(x -> System.out.println(x))

// String str = null;
// Stream.of(str) ->  Stream<String>
//       .forEach(); //execute

// Stream.ofNullable(str)
//       .forEach(); //not execute

// Stream.of(1,2,4) ->  Stream<Integer>
// Stream.empty()
// IntStream.of(1,2,3,4)
// IntStream.range(1,101) : 1->100
// IntStream.rangeClosed(1,100) : 1->100
// IntStream.rangeClosed(1,100)    => output : 1-2-3-4-5-6...
//          .boxed()  => convert IntStream -> Stream<Integer>
//          .mapToObj(String:valueOf)
//          .map(s -> s.concat("-"))
//          .forEach(System.out::printf)


// Stream from array
// String[] names = {"asdfasF", "sfasdf"};
// Arrays.stream(names)
//          .....

//Stream from file text
// Files.lines(Path.of("path-to-file"))
//      ...























