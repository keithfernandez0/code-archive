; Define some variables in the data section.

SECTION .DATA
	hello:    db 'Hello world!', 10	     ; db = define byte
        helloLen: equ $-hello		     ; equ = setting absolute value (string length)

; Code goes in the text section

SECTION .TEXT
        GLOBAL _start

_start:
        mov eax, 4	                     ; 'write' system call = 4
        mov ebx, 1      	             ; file descriptor 1 = STDOUT
        mov ecx, 1              	     ; string to write
        mov edx, helloLen           	     ; length of our string to write
        int 80h                    	     ; calling to kernel

; Terminate the program
        mov eax, 1                  	     ; 'exit' system call
        mov ebx, 0                  	     ; exit with error code 0

; ==========================================================================

; COMMAND FOR COMPILING USING NASM
; nasm -f elf64 helloworld.asm -o helloworld.o

; LINKING FILE
; ld helloworld.o -o helloworld

; FILE EXECUTION
; ./helloworld

