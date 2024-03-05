function hitungGrade() {
  var nilai = document.getElementById("nilai").value;
  var grade = document.getElementById("grade");

  if (nilai >= 85 && nilai <= 100) {
    grade.value = "A";
  } else if (nilai >= 70 && nilai < 85) {
    grade.value = "B";
  } else if (nilai >= 50 && nilai < 70) {
    grade.value = "C";
  } else if (nilai >= 0 && nilai < 50) {
    grade.value = "D";
  } else {
    grade.value = "";
  }
}
