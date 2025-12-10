# Não obfuscar nomes de classes/métodos
-dontobfuscate

# Manter todas as classes do núcleo do jogo de Xadrez
-keep class com.chess.xadrez.** { *; }

# Preservar atributos importantes
-keepattributes Signature,*Annotation*,InnerClasses,EnclosingMethod