#Um posto está vendendo combustíveis com a seguinte tabela de descontos:
# Leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
# Observação: O desconto é aplicado sobre o valor total

A = 'Álcool'
G = 'Gasolina'
p_g = 3.30
p_a = 2.90
C = str(input('Digite o combustível: '))
L = float(input('Quantidade de litros: '))
if C == A:
    L <= 20 
    print('O valor será ', p_a * L - (L * 0.3), 'para o álcool')
elif L >= 25:
    print('O valor será ', p_a * L - (L * 0.5), 'para o álcool')

elif L <= 20:
    print('O valor será ', p_g * L - (L * 0.4), 'para o gasolina')
elif L >= 25:
    print('O valor será ', p_g * L - (L * 0.6), 'para o gasolina')


