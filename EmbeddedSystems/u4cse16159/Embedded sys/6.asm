		AREA PROG2, CODE, READONLY 
ENTRY 
		MOV R0, #Q
		MOV R1,	#S
		AND R2, R1, R0
STOP 	B STOP 
Q		EQU 2_10000001
S		EQU 2_10000000
		END