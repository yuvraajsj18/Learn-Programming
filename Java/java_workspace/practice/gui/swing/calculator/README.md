Project         : A Simple Calculator
Language        : Java
Frameword(GUI)  : Swing


Features -- 
        1. Can perform following operation
            1. + (add)
            2. - (subtract)
            3. x (multiply)
            4. / (divide)
            5. C (backspace)
            6. D (deleted all input)
            7. = (calculates)

Interface -- 
            1. Input Field
            2. Result Field
            3. Keypad

        3. Keypad
            1 2 3 + x
            4 5 6 - /
            7 8 9 ( )
            . 0 D C =
        2. Result
            A Label
            Right justified
            = .....
        1. Input
            A Label made by input from keypad buttons
            Left justified
            Enter:
            ....
            first char can be a number or + or - or . or ( (other disabled)
            last char can not be operator (when last char is operator disable =)

Classes -- 

        1. Main             :   To run the program 
                                contains main().

        2. CalculatorWindow :   Top level frame containing the keypad result and input.
                                GridLayout(3, 1)

        3. Input            :   A JPanel displaying the input in a label.
                                BorderLayout()
                                Enter - L1  (NORTH)
                                Input - L2  (CENTER)

        4. Result           :   A JPanel displaying the result when = pressed.
                                otherwise "Result = "

        5. Keypad           :   A JPanel containing all the buttons

        6. Calculator       :   Values And Operators
                                calculate()
                                applyOp()
                                hasPrecedence()


Algorithm to calculate -- 

1. While there are still tokens to be read in,
   1.1 Get the next token.
   1.2 If the token is:
       1.2.1 A number: push it onto the value stack.
       1.2.2 A variable: get its value, and push onto the value stack.
       1.2.3 A left parenthesis: push it onto the operator stack.
       1.2.4 A right parenthesis:
         1 While the thing on top of the operator stack is not a 
           left parenthesis,
             1 Pop the operator from the operator stack.
             2 Pop the value stack twice, getting two operands.
             3 Apply the operator to the operands, in the correct order.
             4 Push the result onto the value stack.
         2 Pop the left parenthesis from the operator stack, and discard it.
       1.2.5 An operator (call it thisOp):
         1 While the operator stack is not empty, and the top thing on the
           operator stack has the same or greater precedence as thisOp,
           1 Pop the operator from the operator stack.
           2 Pop the value stack twice, getting two operands.
           3 Apply the operator to the operands, in the correct order.
           4 Push the result onto the value stack.
         2 Push thisOp onto the operator stack.
2. While the operator stack is not empty,
    1 Pop the operator from the operator stack.
    2 Pop the value stack twice, getting two operands.
    3 Apply the operator to the operands, in the correct order.
    4 Push the result onto the value stack.
3. At this point the operator stack should be empty, and the value
   stack should have only one value in it, which is the final result.