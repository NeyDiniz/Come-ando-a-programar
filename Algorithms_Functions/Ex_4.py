#Criar um programa em Python que leia os elementos de uma matriz inteira 4 x 4 e:
# Escreva os elementos da diagonal principal;
# Escreva todos os elementos, exceto os elementos da diagonal principal;
# Escreva os elementos da diagonal secundária.

matriz = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0],[0, 0, 0, 0]]
for l in range(0, 4):
    for c in range(0, 4):
        matriz[l][c] = int(input(f'Digite um valor para [{l}, {c}]: '))
print('-' *30)


for l in range(0, 4):
    for c in range(0, 4):
        print(f'[{matriz[l][c]:^5}]', end='')
        if l == c:
            DP

    print()