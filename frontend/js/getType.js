export default function getType (data) {
  return Object.prototype.toString.call(data).slice(8, -1)
} // 데이터 타입을 알 수 있는 로직
// export 내보내기