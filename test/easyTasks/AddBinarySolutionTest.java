package easyTasks;

import dw.easyTasks.AddBinarySolution;
import org.junit.jupiter.api.Test;

class AddBinarySolutionTest {

    AddBinarySolution addBinarySolution = new AddBinarySolution();
    @Test
    void addBinary() {
        System.out.println(addBinarySolution.addBinary(
                "11",
                "1"));
        System.out.println(addBinarySolution.addBinary(
                "101",
                "110"));
        System.out.println(addBinarySolution.addBinary(
                "1101",
                "1011"));
        System.out.println(addBinarySolution.addBinary(
                "10110011",
                "11010100"));
        System.out.println(addBinarySolution.addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));

    }
}