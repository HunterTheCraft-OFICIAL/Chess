# Não obfuscar nomes de classes/métodos
-dontobfuscate

# Manter todas as classes do núcleo do jogo de Xadrez
-keep class chess.** { *; }

# Preservar atributos importantes
-keepattributes Signature,*Annotation*,InnerClasses,EnclosingMethod