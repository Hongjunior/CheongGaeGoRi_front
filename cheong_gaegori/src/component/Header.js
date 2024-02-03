/* Header.js */

import '../index.css';
import './Header.css'; // Header.css를 import

export default function Header() {
  return (
    <div style={{ display: 'flex', alignItems: 'center' }}>
      <span className='logo_container'>
        <img className='logo_image' src='/cheong_logo.jpeg' alt='cute' />
      </span>
      <p>청개고리</p>
      <button className='request-button'>의뢰 게시판</button>
      <button className='free-button'>자유 게시판</button>
      <button className='activity-button'>활동 내역</button>
      <button className='MYPAGE-button'>MY PAGE</button>
      <button className='FAG-button'>FAQ</button>
    </div>
  );
}
