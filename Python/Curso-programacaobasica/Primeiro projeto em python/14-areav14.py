from math import  pi
import sys #já manda o input via linha de comando pelo cmd
import  errno

def help():
    print("é necessário informar o raio do círculo.")
    print("Sintaxe correta: {} <raio>".format(sys.argv[0][2:]))

def circulo(raio): #definir uma função   ##receber raio
    return pi * float(raio) ** 2        ##retorna area e registra esse valor

if __name__ == '__main__': #se o nome do bloco atual for main execute...
    if len(sys.argv) < 2: #len = calcular tamanho de lista
        help()
        #sys.exit(errno.EPERM)
    elif not sys.argv[1].isnumeric():
        help()
        print("o Raio deve ter valor númerico")
        sys.exit(errno.EINVAL)
    # else:
        raio = sys.argv[1]
        area = circulo(raio)
        print('area do circulo', area)

