#Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 

X = int(input("Digite um número: "))

if (X > 10):
    print("O número é maior que 10.")
else:
    print("O número é menor que 10.")

#Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

value_1 = int(input("Digite um valor: "))
value_2 = int(input("Digite outro valor: "))

if value_1 > value_2:
    print(value_1)
else:
    print(value_2)

#Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

v_1 = int(input("Digite um valor: "))
v_2 = int(input("Digite outro valor: "))

if v_1 > v_2:
    print(v_1, v_2)
else:
    print(v_2, v_1)