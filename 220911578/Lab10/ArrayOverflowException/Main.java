class CustomArray {
    private int size;
    private int[] array;
    private int index;

    public CustomArray(int size) {
        this.size = size;
        this.array = new int[size];
        this.index = 0;
    }

    public void push(int element) {
        if (index >= size) {
            System.out.println("Array is full");
            return;
        }
        array[index] = element;
        index++;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < index; i++) {
            builder.append(array[i]);
            if (i < index - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray(3);

        customArray.push(1);
        customArray.push(2);
        customArray.push(3);
        customArray.push(4); // This will result in a message about array overflow

        System.out.println(customArray);
    }
}
