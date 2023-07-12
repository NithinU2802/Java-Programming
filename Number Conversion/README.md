# Number Conversions Directory
  
        1. Decimal
        2. Binary
        3. Octal 
        4. HexaDecimal

        Everything Depends on the base value as Binary - 2, Octal - 8, Decimal - 10
and HexaDecimal - 16.


# Decimal Conversions

    - Decimal to Binary Conversion

            Decimal: 28

            // Addition of Quotient
            28/2 ->  16
            16/2 ->  8
            8/2  ->  4
            
            Binary data  ->  1  2  4  8  16
                         ->  0  0  1  1  1   = 11100.    
                                                        Binary: 11100


    - Decimal to Octal Conversion

            Decimal: 28

            28/8  -> q:3 r:4
            3/8   -> q:0 r:3  

            Octal ->  4 concat 3 = 34  // concat remainder     
                                                        
                                                        Octal: 34


    - Decimal to HexaDecimal Conversion

            Decimal: 28

            28/16  -> q:1 r:12   // 12 -> C
            1/16   -> q:0 r:1

            HexaDecimal  ->   1  + 12(C)  =  1C. 
                                                        HexaDecimal: 1C


# Binary Conversions

    - Binary to Decimal Conversion

            Binary: 10011

            1 -> 1*1
            1 -> 1*2
            0 -> 0*4
            0 -> 0*8
            1 -> 1*16

            1 + 2 + 0 + 0 + 16 = 19.                  
                                                        Decimal: 19


    - Binary to Octal Conversion

            Binary: 10011

            010        011
             2  concat  3   = 23.                    
                                                        Octal: 23


    - Binary to HexaDecimal Conversion

            Binary: 10011

            0001        0011
             1   concat  3    = 13                    
                                                        HexaDecimal: 13



# Octal Conversion

    - Octal to Decimal Conversion 

            Octal:34

            4 -> 4*1  = 4
            3 -> 3*8  = 24

            Decimal: 4 + 24 =28.
                                                        Decimal: 28



    - Octal to Binary Conversion

            Octal: 34

            4 -> 4 = 100
            3 -> 3 = 011

            Binary : 011 Concat 100 = 011100.
                                                        Octal: 011100



    - Octal to HexaDecimal Conversion

            Octal: 34 

            4 -> 100
            3 -> 011

            Binary -> 011 100 -> 0001  1100
                        0001          1100
            HexaDecimal:  1   concat    12(C)  = 1C.
                                                        HexaDecimal: 1C



# HexaDecimal Conversion

    - HexaDecimal to Binary Conversion 

            HexaDecimal: 1C

            1 -> 0001
            C -> 1100 // c is 12

            Binary: 0001 concat 1100 = 11100.
                                                        Binary: 11100


    - HexaDecimal to Decimal Conversion

            HexaDecimal: 1C

            C -> 12
            1 -> 1

            Decimal: 12*1 + 1*16 = 28.
                                                        Decimal: 28 


    - HexaDecimal to Octal Conversion

            HexaDecimal: 1C

            C -> 1100
            1 -> 0001

            Octal: 0001  1100 -> 011 100 
                 = 3 concat 4 = 34.
                                                        HexaDecimal: 34
