**_Hashing_**

Keywords to remember : 
1. Brute Force
2. Dictionary attack
3. Rain bow table
4. MD5/SHA Algorithms
5. Message , Salt & Digest
6. MessageDigest Class - For Hashing
7. SecureRandom Class - For Salt
8. CPU intensive algorithms such as PBKDF2, Bcrypt or Scrypt

1. A secure hash is an encrypted sequence of characters obtained after applying certain algorithms and manipulations on data.
2. The password to be encoded is often called the “message” and the generated hash value is called the message digest or simply “digest”.
3. Please remember that once this password hash is generated and stored in the database, you can not convert it back to the original password.
4. Hashing is UniDirectional

    Message -> Hashing Algorithm -> Digest

**_Simple password security using MD5 algorithm_**

1. The MD5 Message-Digest Algorithm is a widely used cryptographic hash function that produces a 128-bit (16-byte) hash value. 
2. It’s very simple and straight forward
3. Basic idea is to map data sets of variable length to data sets of a fixed length.
4. In order to do this, the input message is split into chunks of 512-bit blocks. A padding is added to the end so that it’s length can be divided by 512. Now, these blocks are processed by the MD5 algorithm, which operates in a 128-bit state, and the result will be a 128-bit hash value. 
5. After applying MD5, generated hash is typically a 32-digit hexadecimal number.
6. Although MD5 is a widely spread hashing algorithm, is far from being secure, MD5 generates fairly weak hashes. It’s main advantages are that it is fast, and easy to implement. But it also means that it is susceptible to 
 Brute-force and Dictionary attacks.   
7. Rainbow tables with words and hashes generated allows searching very quickly for a known hash and getting the original word.   
8. MD5 is not collision resistant which means that different passwords can eventually result in the same hash.
9. Today, if you are using MD5 hash in your application then consider adding some salt to your security.

Brute-force attack
1. This article is about the cryptanalytic method. 
2. In cryptography, a brute-force attack consists of an attacker submitting many passwords or passphrases with the hope of eventually guessing correctly. The attacker systematically checks all possible passwords and passphrases until the correct one is found. Alternatively, the attacker can attempt to guess the key which is typically created from the password using a key derivation function. This is known as an exhaustive key search.   

Dictionary attack
In cryptanalysis and computer security, a dictionary attack is a form of brute force attack technique for defeating a cipher or authentication mechanism by trying to determine its decryption key or passphrase by trying thousands or millions of likely possibilities, such as words in a dictionary or previously used passwords, often from lists obtained from past security breaches.

_**Making MD5 more secure using salt**_
1. salt is some randomly generated text, which is appended to the password before obtaining hash.
2. We always need to use a SecureRandom to create good salts, and in Java, the SecureRandom class supports the “SHA1PRNG” pseudo random number generator algorithm, and we can take advantage of it.
3. Please note that now you have to store this salt value for every password you hash. Because when user login back in system, you must use only originally generated salt to again create the hash to match with stored hash. If a different salt is used (we are generating random salt), then generated hash will be differen

**_`Medium password security using SHA algorithms`_**
1. The SHA (Secure Hash Algorithm) is a family of cryptographic hash functions. It is very similar to MD5 except it generates more strong hashes. 
2. However these hashes are not always unique, and it means that for two different inputs we could have equal hashes. When this happens it’s called a “collision”. Chances of collision in SHA is less than MD5. But, do not worry about these collisions because they are really very rare.
3. Java has 4 implementations of SHA algorithm. They generate the following length hashes in comparison to MD5 (128-bit hash):

SHA-1 (Simplest one – 160 bits Hash)
SHA-256 (Stronger than SHA-1 – 256 bits Hash)
SHA-384 (Stronger than SHA-256 – 384 bits Hash)
SHA-512 (Stronger than SHA-384 – 512 bits Hash)

**Advanced password security using PBKDF2WithHmacSHA1 algorithm**
1. Today is that hardwares have become so much fast that any brute force attack using dictionary and rainbow tables, any password can be cracked in some less or more time.
2. Too solve this problem, general idea is to make brute force attack slower so that damage can be minimized. Our next algorithm, works on this very concept. The goal is to make the hash function slow enough to impede attacks, but still fast enough to not cause a noticeable delay for the user.
3. This feature is essentially implemented using some CPU intensive algorithms such as PBKDF2, Bcrypt or Scrypt.
4. These algorithms take a work factor (also known as security factor) or iteration count as an argument. This value determines how slow the hash function will be. When computers become faster next year we can increase the work factor to balance it out.
5. Java has implementation of “PBKDF2” algorithm as “PBKDF2WithHmacSHA1“.

**_`More Secure password hash using bcrypt and scrypt algorithms`_**


Final Notes
Storing the text password with hashing is most dangerous thing for application security today.
MD5 provides basic hashing for generating secure password hash. Adding salt make it further stronger.
MD5 generates 128 bit hash. To make ti more secure, use SHA algorithm which generate hashes from 160-bit to 512-bit long. 512-bit is strongest.
Even SHA hashed secure passwords are able to be cracked with today’s fast hardwares. To beat that, you will need algorithms which can make the brute force attacks slower and minimize the impact. Such algorithms are PBKDF2, BCrypt and SCrypt.
Please take a well considered thought before applying appropriate security algorithm.