package stack.vm;


import java.util.Collection;

import static stack.vm.Instructions.ADD;
import static stack.vm.Instructions.HALT;
import static stack.vm.Instructions.PUSH;
public class main {
    public static void main(String[] args) {
        cpu core1 = new cpu(PUSH, 1, PUSH, 20, ADD, HALT);
        
        core1.run();

        System.out.println(core1.getInstructionAddress());
        System.out.println(core1.isHalted());
        Collection<Integer> numbers = core1.getStack(); // Assign the return type
        for (Integer number : numbers) {           // Print each element one by one
            System.out.print(number + " ");
        }
        System.out.println("");
        
        System.out.println("...Running.....");

    }
    
}