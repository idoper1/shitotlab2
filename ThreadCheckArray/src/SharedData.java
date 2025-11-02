import java.util.ArrayList;

/**
 * The {@code SharedData} class is a container for shared data used among multiple threads or components.
 * <p>
 * It holds an {@link ArrayList} of integers, a boolean array representing win states,
 * a flag indicating a specific condition, and a constant integer value {@code b}.
 * </p>
 * 
 * <p>Example usage:</p>
 * <pre>
 *     ArrayList&lt;Integer&gt; list = new ArrayList&lt;&gt;();
 *     SharedData data = new SharedData(list, 5);
 *     data.setFlag(true);
 * </pre>
 * 
 * @author idoper
 * @version 1.0
 */
public class SharedData {

    /** The shared list of integers. */
    private ArrayList<Integer> array = new ArrayList<>();

    /** The boolean array used to track win conditions. */
    private boolean[] winArray;

    /** A flag used to represent a condition or state. */
    private boolean flag;

    /** A constant integer value associated with this shared data instance. */
    private final int b;

    /**
     * Constructs a {@code SharedData} object with the specified list and integer value.
     *
     * @param array the list of integers to be stored
     * @param b an integer constant associated with this data
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the win array associated with this data.
     *
     * @return the boolean array representing win conditions
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the win array for this data.
     *
     * @param winArray the boolean array representing win conditions
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the list of integers stored in this data object.
     *
     * @return the list of integers
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Returns the constant integer {@code b}.
     *
     * @return the integer constant
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the current value of the flag.
     *
     * @return {@code true} if the flag is set, {@code false} otherwise
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag to the specified value.
     *
     * @param flag the new value for the flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
