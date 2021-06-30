#Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A - Azul, P - Preto, V - Verde e C - Castanho) e a cor dos cabelos (P - Preto, C - Castanho, L - Louro e R - Ruivo) de 20 pessoas, calcule e mostre:
# a - A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
# b - A média das idades das pessoas com altura inferior a 1,50;
# c - A percentagem de pessoas com olhos azuis entre todas as analisadas; e
# d - A quantidade de pessoas ruivas e que não possuem olhos azuis.

A = 'azul'
P = 'preto'
V = 'verde'
C = 'castanho'

i = int(input('Digite sua idade: '))
p = float(input('Digite seu peso: '))
h = float(input('Digite sua altura: '))
o = str(input('Digite a cor dos olhos:'))
cabelo = str(input('Digite a cor do cabelo: '))

for i in range(1, 21):
    