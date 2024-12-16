fun selecOperation(): String {
    println("Pilihlah operasi yang anda ingin coba di bawah ini")
    println("1. Kalkulator")
    println("2. Conversi suhu")
    println("3. Luas dan keliling bangunan")
    println("4. Nilai Rata-rata mahasiswa")
    println("5. Tic Tac Toe (Special)")
    println("6. Mirror Array (Special)")
    println("7. Penjumlahan Matrix (Special)")

    print("Silahkan Masukan Pilihan Anda : ")
    return readln()
}

fun calculate(a: Int, b: Int, op: String) {
   try {
       val result = when (op) {
           "+" -> a + b
           "-" -> a - b
           "x" -> a * b
           "/" -> a / b
           else -> throw Exception("Operator tidak valid silahkan pilih operator yang benar")
       }
       println("Hasil dari penjumlahan $a $op $b : $result")
   } catch (result: Exception) {
       if (b == 0) {
           println("tidak bisa dibagi dengan 0")
       } else {
           println(("Operator tidak valid silahkan pilih operator yang benar"))
       }
   }
}

fun conversiSuhu(int : Int, choose : Int) {
    try {
        when (choose) {
            1 -> {
                println("anda ingin melalukan conversi dari ke mana ?")
                println("1. Kelvin")
                println("2. Fahrenheit")

                print("Silahkan Masukan Pilihan Anda : ")
                val choose2 = readln().toInt()

                when (choose2) {
                    1 -> {
                        val result = String.format("%.2f", int + 273.15)
                        println("Hasil dari konversi dari Celsius ke Kelvin : $result")
                    }
                    2 -> {
                        val result = String.format("%.2f",int * 9 / 5 + 32)
                        println("Hasil dari konversi dari Celsius ke Fahrenheit : $result")
                    }
                    else -> throw Exception("Pilihan tidak valid silahkan pilih pilihan yang benar")
                }
            }

            2 -> {
                println("anda ingin melalukan conversi dari ke mana ?")
                println("1. Celsius")
                println("2. Fahrenheit")

                print("Silahkan Masukan Pilihan Anda : ")
                val choose2 = readln().toInt()

                when (choose2) {
                    1 -> {
                        val result = String.format("%.2f", int - 273.15)
                        println("Hasil dari konversi dari Kelvin ke Celsius : $result")
                    }
                    2 -> {
                        val result = String.format("%.2f", (int * 9 / 5) - 459.67)
                        println("Hasil dari konversi dari Kelvin ke Fahrenheit : $result")
                    }
                }
            }

            3 -> {
                println("anda ingin melalukan conversi dari ke mana ?")
                println("1. Celsius")
                println("2. Kelvin")

                print("Silahkan Masukan Pilihan Anda : ")
                val choose2 = readln().toInt()

                when (choose2) {
                    1 -> {
                        val result = String.format("%.2f", int * 9 / 5 + 32)
                        println("Hasil dari konversi dari Fahrenheit ke Celsius : $result")
                    }
                    2 -> {
                        val result = String.format("%.2f",int + 459.67)
                        println("Hasil dari konversi dari Fahrenheit ke Kelvin : $result")
                    }
                    else -> throw Exception("Pilihan tidak valid silahkan pilih pilihan yang benar")
                }
            }
        }
    } catch (e: Exception) {
        println("Pilihan tidak valid silahkan pilih pilihan yang benar")
    }
}

fun luasDanKeliling(chose: Int) {
    try {
       when (chose) {
           1 -> {
                print("Masukan sisi persegi : ")
                val luasPersegi = readln().toInt()
                val luas = luasPersegi * luasPersegi
                val keliling = 4 * luasPersegi

                println("Luas persegi : $luas")
                println("Keliling persegi : $keliling")
           }
           2 -> {
               print("Masukan panjang persegi panjang : ")
               val LuasPersegiPanjang = readln().toInt()
               print("Masukan lebar persegi panjang : ")
               val KelilingPersegiPanjang = readln().toInt()

               val luas = LuasPersegiPanjang * KelilingPersegiPanjang
               val keliling = 2 * (LuasPersegiPanjang + KelilingPersegiPanjang)

               println("Luas persegi panjang : $luas")
               println("Keliling persegi panjang : $keliling")
           }
           3 -> {
               print("Masukan alas segitiga : ")
               val alasSegitiga = readln().toDouble()
               print("Masukan tinggi segitiga : ")
               val tinggiSegitiga = readln().toDouble()

               val nilaiPerpangkatanAlas = Math.pow(alasSegitiga, 2.0)
               val nilaiPerpangkatanTinggi = Math.pow(tinggiSegitiga, 2.0)

               val total = nilaiPerpangkatanAlas + nilaiPerpangkatanTinggi
               val nilaiakarkuadratnya = Math.sqrt(total)

               val luas = 0.5 * alasSegitiga * tinggiSegitiga
               val keliling = alasSegitiga + tinggiSegitiga + nilaiakarkuadratnya

               val keString = String.format("%.0f", keliling)
               val keString2 = String.format("%.0f", luas)

               println("Luas segitiga : $keString2")
               println("Keliling segitiga : $keString")
           }
           4 -> {
               print("Masukan diameter lingkaran : ")
               val diameter = readln().toInt()

               val jarijarilingkaran = diameter / 2.0
               val keliling = 3.14 * jarijarilingkaran * jarijarilingkaran
               val luas = 2 * 3.14 * jarijarilingkaran

               val keString = String.format("%.0f", keliling)
               val keString2 = String.format("%.0f", luas)

               println("Keliling lingkaran : $keString2")
               println("Luas lingkaran : $keString")
           }
       }
    } catch (e: Exception) {
        println("Pilihan tidak valid silahkan pilih pilihan yang benar")
    }
}

fun nilaiRataRata() {
    print("Masukan jumlah matakuliah mahasiswa : ")
    val jumlahMatakuliah = readln().toInt()
    var jumlahNilai = 0.0;

    var counter = 0
    var i = 0
    while (i < jumlahMatakuliah) {
        print("Masukan nilai untuk matakuliah ke " + (i+1)  + ": ")
        val nilai = readln().toDouble()
        jumlahNilai += nilai
        counter++;
        i++
    }
    jumlahNilai /= counter
    println("Nilai rata rata dari mahasiswa adalah $jumlahNilai")
}

fun cekHasil(int: Array<IntArray>): Char {
    val ukuran = int.size

    // pengecekan horizontal
    for (i in 0 until ukuran) {
        var horizontal = true;
        for (j in 1 until ukuran) {
            if (int[i][j] != int[i][0] || int[i][0] == 0) {
                horizontal = false;
                break;
            }
        }
        if (horizontal) {
            return if (int[i][0] == 1) 'O' else 'X'
        }
    }

    //pengecekan vertikal
    for (i in 0 until ukuran) {
        var vertikal = true;
        for (j in 1 until ukuran) {
            if (int[j][i] != int[0][i] || int[0][i] == 0) {
                vertikal = false;
                break;
            }
        }
        if (vertikal) {
            return if (int[0][i] == 1) 'O' else 'X'
        }
    }

    //Pengecekan Digonal pertama
    var diagonalutama = true
    for (i in 1 until ukuran) {
        if (int[i][i] != int[0][0] || int[0][0] == 0) {
            diagonalutama = false
            break
        }
    }
    if (diagonalutama) {
        return if (int[0][0] == 1) 'O' else 'X'
    }

    //Pengecekan diagonal terbalik
    var diagonalterbalik = true;
    for (i in 0 until ukuran) {
        if (int[i][ukuran - i - 1] != int[0][ukuran - 1] || int[0][ukuran - 1] == 0) {
            diagonalterbalik = false;
            break;
        }
    }
    if (diagonalterbalik) {
        return if (int[0][ukuran - 1] == 1) 'O' else 'X'
    }

    for (i in 0 until ukuran) {
        for (j in 0 until ukuran) {
            if (int[i][j] == 0) {
                return '?'
            }
        }
    }
    return '-'
}

fun reverseRow(row: Array<IntArray>, inputan: Int ) {

    for (i in 0 until inputan) {
        var start = 0
        var end = row.size - 1

        // memindahkan element 1 sama lain
        while (start < end) {
            val temp = row[start][i]
            row[start][i] = row[end][i]
            row[end][i] = temp

            start++
            end--
        }
    }

    for (i in 0 until inputan) {
        for (j in 0 until inputan) {
            print("${row[i][j]} ")
        }
        println()
    }
}

fun reverseCollum(col: Array<IntArray>, inputan: Int ) {

    for (i in 0 until inputan) {
        var start = 0
        var end = col.size - 1

        // memindahkan element 1 sama lain
        while (start < end) {
            val temp = col[i][start]
            col[i][start] = col[i][end]
            col[i][end] = temp

            start++
            end--
        }
    }

    for (i in 0 until inputan) {
        for (j in 0 until inputan) {
            print("${col[i][j]} ")
        }
        println()
    }
}

// penjumlahan matrix
fun penjumlahanMatrix(matrix1: Array<IntArray>, matrix2: Array<IntArray>) {
    val ukuran = matrix1.size

    for (i in 0 until ukuran) {
        for (j in 0 until ukuran) {
            matrix1[i][j] += matrix2[i][j]
        }
      }

    println("Hasil penjumlahan matrix 1 dengan matrix 2 adalah : ")
      for (i in 0 until ukuran) {
          for (j in 0 until ukuran) {
              print("${matrix1[i][j]} ")
          }
          println()
      }
    }

fun main() {
    while (true) {
        val choose = selecOperation()
        when (choose) {
            "1" -> {
                print("Masukan angka pertama : ")
                val a = readln().toInt()
                print("Masukan angka kedua : ")
                val b = readln().toInt()
                print("Masukan Operator (+, -, x, /) : ")
                val op = readln()
                calculate(a, b, op)
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
            "2" -> {
                println("Silahkan pilih dulu suhu yang ingin anda konversi")
                println("1. Celsius")
                println("2. Kelvin")
                println("3. Fahrenheit")

                print("Silahkan Masukan Pilihan Anda : ")
                val chose = readln().toInt()

                print("Masukan Nilai suhu anda terlebih dahulu : ")
                val int = readln().toInt()

                conversiSuhu(int, chose)
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
            "3" -> {
                println("Anda ingin menghitung luas dan keliling apa ?")
                println("1. Persegi")
                println("2. Persegi Panjang")
                println("3. Segitiga")
                println("4. Lingkaran")

                print("Silahkan Masukan Pilihan Anda : ")
                val chose = readln().toInt()

                luasDanKeliling(chose)
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
            "4" -> {
                nilaiRataRata()
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
            "5" -> {
                try {
                    println("Masukan ukuran dari petak nya")
                    println("Misanya = 3x3 yaitu 3")
                    println("dan Misalnya = 4x4 yaitu 4 Dst")
                    print("Masukan ukuranya : ")
                    val ukuran = readln().toInt()
                    val papan = Array(ukuran) { IntArray(ukuran) }

                    for (i in 0 until ukuran) {
                        val baris = readln().split(" ").map { it.toInt() }
                        if (baris.size != ukuran) throw IllegalArgumentException("Jumlah elemen tidak sesuai ukuran")
                        for (j in 0 until ukuran) {
                            papan[i][j] = baris[j]
                        }
                    }
                    val cetak = cekHasil(papan)
                    println(cetak)
                } catch (e: Exception) {
                    println("Data yang anda masukan tidak valid silahkan ulangi kembali")
                }
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
            "6" -> {
                try {
                    println("Ingin mencoba membalikan apa ?")
                    println("1. baris")
                    println("2. kolom")
                    print("Pilihlah satu opsi di atas : ")

                    val pilihan = readln().toInt()

                    when (pilihan) {
                        1 -> { // untuk penukaran baris
                            val input = readln().toInt()
                            val matrix = Array(input) { IntArray(input) }

                            for (i in 0 until input) {
                                val baris = readln().split(" ").map { it.toInt() }
                                for (j in 0 until input) {
                                    matrix[i][j] = baris[j]
                                }
                            }
                            val mirror = reverseRow(matrix, input)
                            println(mirror)
                        }
                        2 -> { // untuk penukaran kolom
                            val input = readln().toInt()
                            val matrix = Array(input) { IntArray(input) }

                            for (i in 0 until input) {
                                val baris = readln().split(" ").map { it.toInt() }
                                for (j in 0 until input) {
                                    matrix[i][j] = baris[j]
                                }
                            }
                            val mirror = reverseCollum(matrix, input)
                            println(mirror)
                        }
                    }
                } catch (e: Exception) {
                    println("Data yang anda masukan tidak valid silahkan ulangi kembali")
                }
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
            "7" -> {
                try {
                    print("Masukan ukuran dari matrix 2 2 nya : ")
                    val inputan = readln().toInt()

                    val matrix1 = Array(inputan) { IntArray(inputan) }
                    val matrix2 = Array(inputan) { IntArray(inputan) }

                    println("Masukan matrix 1 : ")
                    for (i in 0 until inputan) {
                        val masukan = readln().split(" ").map { it.toInt() }
                        for (j in 0 until inputan) {
                            matrix1[i][j] = masukan[j]
                        }
                    }

                    println("Masukan matrix 2 : ")
                    for (i in 0 until inputan) {
                        val masukan = readln().split(" ").map { it.toInt() }
                        for (j in 0 until inputan) {
                            matrix2[i][j] = masukan[j]
                        }
                    }
                    penjumlahanMatrix(matrix1, matrix2)
                } catch (e: Exception) {
                    println("Data yang anda masukan tidak valid silahkan ulangi kembali")
                }
                print("Apakah anda ingin berheti ? (y/n) : ")
                if (readln() == "n") continue else break
            }
        }
    }
}