#Algoritmo 1 - Tendo como dados de entrada a altura e o sexo de uma pessoa (M masculino e F feminino), construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas: 
# para homens: (72.7*h)-58
# para mulheres: (62.1*h)-44.7

M = 'Masculino'
F = 'Feminino'
h = float(input('Digite sua altura: '))
s = str(input('Digite seu sexo: '))

if s == M:
    print('Seu peso ideal é:', (72.7*h)-58)
else: 
    print('Seu peso ideal é:', (62.1*h)-44.7)

