public class StringBuff {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(5);

        System.out.println(str.hashCode());
        // str.ensureCapacity(17);
        str.append("Java");
        // System.out.println(str.capacity());
        str.insert(0, "Hello ");
        // str.delete(0, 6);
        System.out.println(str.hashCode());

        str.reverse();
        System.out.println(str);
    }
}

/*
StringBuffer class is used to create mutable String objects.
Thread Safe (multiple thread can't access it simultaneously)

default capacity: 16

append(String s)
insert(int offset, String s)
replace(int startindex, int endindex, String s)
delete(int startindex, int endindex)
reverse()
capacity() - new cpaacity will be allocated to the string acc. to ((oldCapacity*2) + 2)
ensureCapacity(int minimumCapacity)
charAt(int index)
length()
substring(int beginIndex)
substring(int beginIndex, int endIndex)

*/