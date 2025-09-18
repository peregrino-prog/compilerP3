;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; ZONA DE DADOS
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
ORIG 8000h
a WORD 0
b WORD 0
c WORD 0
t0 WORD 0

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; ZONA DE CÓDIGO
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
ORIG 0000h
MOV R1, 5
MOV M[a], R1
MOV R1, 3
MOV M[b], R1
MOV R1, M[a]
ADD R1, M[b]
MOV M[t0], R1
MOV R1, M[t0]
MOV M[c], R1
FIM: BR FIM
