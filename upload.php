<?php
if(isset($_POST['submit'])){
  $file = $_FILES['file'];

  $FileName = $_FILES['file']['name'];
  $FileTmpName = $_FILES['file']['tmp_name'];
  $FileSize = $_FILES['file']['size'];
  $FileError = $_FILES['file']['error'];
  $FileType = $_FILES['file']['type'];

  $fileExt = explode('.',$FileName);
  $fileActualEtc = strtolower(end($fileExt));
  
  $allowed = array('txt', 'pdf', 'docx', 'doc', 'png', 'jpg', 'jpeg', 'java');

  if (in_array($fileActualEtc, $allowed)){
    if($FileError === 0){
      if($FileSize <= 5000000){
        $FileNameNew = uniqid('',true).".".$fileActualEtc;
        $FileDest = 'uploads/'.$FileName;
        move_uploaded_file($FileTmpName, $FileDest);
        header("Location: up.php?uploadSuccess"); 
      }else{
        echo "Your File is too big!!Compress Your File under 5MB.";
      }
    }else{
      echo "There was an Error Uploadind your File!!";
    }
  }else{
    echo "You can't Upload this file!";
  }

}
?>