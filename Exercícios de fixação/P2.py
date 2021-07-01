# n = int(input("Verificar numeros primos ate: "))
# mult=0

# for count in range(2,n):
#     if (n % count == 0):
#         print("Múltiplo de",count)
#         mult += 1

# if(mult==0):
#     print("É primo")
# else:
#     print("Tem",mult," múltiplos acima de 2 e abaixo de",n)

#Função para testar se é primo!
# def testaPrimo(num):
#     # 1 não é primo!
# 	if (num == 1):
# 	 	return False

#     #Devomos procurar um dividsor de 2 até a metade do número. Se existir pelo menos um, não é primo!
# 	for d in range(2,(int)(num/2)+1):
	 
# 		if (num % d == 0):
# 		 return False
	
# 	# Se o loop terminar e não encontrar divisores, o número é primo!
# 	else:
# 	 return True
# #fim da função

# soma = 0
# #Soma todos os primos de 1 a 10
# #2+3+5+7 = 17
# for i in range(1, 1000000):
# 	if (testaPrimo(i)):
# 		 soma += i

# else:
# 	print(soma)

n = int(input('Digite um número inteiro positivo: '))
soma = 0
conta = 0
num = 2
while conta < n:
    primo = True
    for i in range(2, num):
        if num % i == 0:
           primo = False
           break
    if primo:
        print(num)
        soma += num
        conta += 1
    num += 1
print(soma)