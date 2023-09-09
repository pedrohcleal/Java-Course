''''Complete a solução para que ela divida a string em pares de dois caracteres. 
Se a string contiver um número ímpar de caracteres, 
ela deverá substituir o segundo caractere ausente do par final por um sublinhado ('_').'''

def solution(s):
    let_dupla = ''
    lista_pares = []
    contador = 0
    for x in s:
        let_dupla += x
        if len(let_dupla) == 2: 
            lista_pares.append(let_dupla)
            let_dupla = ''
        contador += 1
        if not len(s) % 2 == 0:
            if contador == len(s):
                lista_pares.append(x + '_')
            


    return lista_pares
    
    print()
    


print(solution('abc'))       #['ab', 'c_']
print(solution('abcdef'))    #['ab', 'cd', 'ef']
