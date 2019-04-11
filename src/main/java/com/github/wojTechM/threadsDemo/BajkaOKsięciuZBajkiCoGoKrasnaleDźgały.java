package com.github.wojTechM.threadsDemo;

/**
 * Zadanie bardzo proste. Macie kod obsługujący zwłoki księcia
 * Możecie
 * a) dostawić 2 znaki/litery/liczby/symbole w kodzie i kod ma zadziałać
 * b) usunąć 2 znaki w kodzie i kod ma zadziałać
 * c) zamienić kolejność 2 linijek (nie dotyczy linijek w metodzie run)
 * tj. w konsoli masz mieć komunikat:
 *
 * O nie! Zwłoki księcia! Szybko! Wskrześ dziada!
 * It's ALIVE!
 * Móóózzgiiiii
 *
 * @author Makiela Wojciech
 */
class BajkaOKsięciuZBajkiCoGoKrasnaleDźgały {

    public static void main(String[] args) {
        Wskrzeszable zwłoki = new ZwłokiKsięciaZBajki();
        NekromantaBehaviour nekromanta = new Xardas();
        nekromanta.wskrześ(zwłoki);
    }
}
